package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxProductArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        int pref = 1,sufi=1,ans=1;
        for (int i = 0; i < size; i++) {

            if(pref == 0) {
                pref = 1;
            }
            if(sufi == 0) {
                sufi =1;
            }
            pref = pref * arr.get(i);
            sufi = sufi * arr.get(size-1-i);
            ans = Math.max(ans,Math.max(pref,sufi));
        }
        System.out.println("Anser is " + ans);
    }
}
