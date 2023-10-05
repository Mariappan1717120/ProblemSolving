package array;

import java.util.*;

public class LongestSubArrayWithGivenSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();
        Integer sum = 0;
        int len = 0;
        Map<Integer,Integer> sumFirstIndexMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            sum = sum + arr.get(i);
            if(sum == k) {
                len = Math.max(len , i+1);
            }
            int rem = sum - k;
            if(sumFirstIndexMap.containsKey(rem)) {
                len = Math.max(len,i-sumFirstIndexMap.get(rem));
            }
            if(!sumFirstIndexMap.containsKey(sum)) {
                sumFirstIndexMap.put(sum,i);
            }

        }
        System.out.println("Longest Sub array Length "+ len);
    }
}
