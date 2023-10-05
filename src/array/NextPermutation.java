package array;

import java.util.*;

public class NextPermutation {

    public static void main(String args[]) {
        Integer size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        size =  scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<size;i++) {
            arr.add(scanner.nextInt());
        }
        nextPermutation(arr);
        for (int i = 0; i < size ; i++) {
            System.out.print(arr.get(i));
        }

    }

    public static void nextPermutation(List<Integer> arr) {
        int ind = -1;
        for(int i = arr.size() - 2; i >= 0; i--) {
            if(arr.get(i) < arr.get(i+1)) {
                ind = i;
                break;
            }
        }
        if(ind == -1) {
            Collections.reverse(arr);
            return;
        }
        for(int i=arr.size() - 1; i > ind; i--) {
            if(arr.get(i) > arr.get(ind)) {
                Integer temp = arr.get(ind);
                arr.set(ind,arr.get(i));
                arr.set(i,temp);
                break;
            }
        }
        Collections.reverse(arr.subList(ind+1,arr.size()));
    }

}
