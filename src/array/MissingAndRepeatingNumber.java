package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingAndRepeatingNumber {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }

        int sum =0;
        int sqsum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr.get(i);
            sqsum = sqsum + (arr.get(i) * arr.get(i));
        }
        int sn = size * (size +1)/2;
        int sqsn = size * (size +1) * (2*size +1)/6;

        /*
        Let x is repeative number and y is missing number then
        sum-sn = x - y

        sqsum - sqsn = x^2-y^2 = (x+y) (x-y)
        x+y = (sqsum - sqsn)/x-y = (sqsum - sqsn)/sum-sn

         */

        int xminusy = sum - sn;
        int xplusy = (sqsum - sqsn) / xminusy;
        int x = (xplusy + xminusy) / 2;
        int y = xplusy - x;
        System.out.println("Repeate number is " + x + " Missing number is " + y);
    }
}
