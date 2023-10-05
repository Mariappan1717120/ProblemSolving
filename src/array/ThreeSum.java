package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Integer size;
        System.out.println("Enter the size of the array");
        size = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }
        List<List<Integer>> result = threeSumPairs(arr);
        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }

    private static List<List<Integer>> threeSumPairs(List<Integer> arr) {
        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            int j = i+1;
            int k = arr.size()-1;
            while(j<k) {
                Integer temp = arr.get(i) + arr.get(j) + arr.get(k);
                if(temp == 0) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr.get(i));
                    pair.add(arr.get(j));
                    pair.add(arr.get(k));
                    result.add(pair);
                    j=j+1;
                    k=k-1;
                } else if(temp > 0) {
                    k=k-1;
                } else {
                    j=j+1;
                }
            }
        }
        return result;
    }
}
