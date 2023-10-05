package binarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinInRotatedSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        Integer min = findMinimumUsingBinSearch(arr);
        System.out.println("Minimu is "+ min);
    }

    private static Integer findMinimumUsingBinSearch(List<Integer> arr) {
        int low = 0;
        int high = arr.size()-1;
        int ans=Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low+high)/2;

            if(arr.get(low) < arr.get(high)) {
                ans = arr.get(low);
                break;
            }
            // left sorted array
            if(arr.get(low) <= arr.get(mid)) {
                 ans = Math.min(ans,arr.get(low));
                 low = mid +1;
            } else {
                ans = Math.min(ans,arr.get(mid));
                high = mid-1;
            }
        }
        return ans;
    }
}
