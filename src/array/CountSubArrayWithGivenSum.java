package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountSubArrayWithGivenSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        for (int i = 0; i < size; i++) {
            sum = sum + arr.get(i);
            if (sum == k) {
                cnt = cnt + 1;
            }
            int rem = sum - k;
            if (sumCount.containsKey(rem)) {
                cnt = cnt + sumCount.get(rem);
            }
            if (sumCount.containsKey(sum)) {
                sumCount.put(sum, sumCount.get(sum) + 1);
            } else {
                sumCount.put(sum, 1);
            }

        }
        System.out.println("Number of Subarray which equal to that sum is "+ cnt);

    }

}
