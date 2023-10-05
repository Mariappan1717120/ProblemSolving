package array;

import java.util.*;

public class MajorityElements {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if(countMap.containsKey(arr.get(i))) {
                Integer currentCount = countMap.get(arr.get(i));
                countMap.put(arr.get(i),currentCount+1);
            } else {
                countMap.put(arr.get(i),1);
            }
        }
        Integer threshold = arr.size()/3;
        for(Integer key : countMap.keySet()) {
            if(countMap.get(key) > threshold) {
                System.out.print(key + " ");
            }
        }
    }
}
