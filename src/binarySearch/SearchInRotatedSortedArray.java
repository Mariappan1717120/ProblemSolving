package binarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();


        Boolean isFound = binSearchInSortedRotated(arr, k);
        System.out.println(isFound);
    }

    private static Boolean binSearchInSortedRotated(List<Integer> arr, int k) {

        int low = 0;
        int high = arr.size()-1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr.get(mid) == k) {
                return true;
            }

            //Edge case
            if(arr.get(low)==arr.get(mid) && arr.get(mid)==arr.get(high)) {
                low = low + 1;
                high = high - 1;
            }

            //if left half is sorted
            if(arr.get(low) <= arr.get(mid)) {
                if(arr.get(low) <= k && k<= arr.get(mid)) {
                    high = mid -1;
                } else {
                    low = mid + 1;
                }

            }
            // Right part is sorted
            else {
                if(arr.get(mid) <= k && k<= arr.get(high)) {
                    low=mid+1;
                } else {
                    high = mid-1;
                }

            }
        }
        return false;
    }

}
