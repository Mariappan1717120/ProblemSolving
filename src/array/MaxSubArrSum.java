package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSubArrSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(scanner.nextInt());
        }
        Integer maxSum = Integer.MIN_VALUE;
        Integer currSum = 0;
        int start = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for (int i = 0; i < size; i++) {
            currSum = currSum + arr.get(i);
            if(maxSum < currSum) {
                maxSum = currSum;
                maxStart = start;
                maxEnd = i;
            }
            if(currSum < 0) {
                currSum = 0;
                start = i+1;
            }

        }
        System.out.println("Maximum sum is :: " + maxSum);
        for (int i = maxStart; i <= maxEnd ; i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
