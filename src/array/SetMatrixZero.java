package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Integer size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Matrix");
        size = scanner.nextInt();
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        Integer col1 = 1;
        for(int i = 0; i < size; i++) {
            for(int j=0;j<size;j++) {
                if(matrix.get(i).get(j)==0) {
                    matrix.get(i).set(0,0);
                    if(j!=0) {
                        matrix.get(0).set(j,0);
                    } else {
                        col1 = 0;
                    }

                }
            }
        }

        for(int i=1;i<size; i++) {
            for(int j=1; j<size; j++) {
                if(matrix.get(i).get(j) != 0) {
                    if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j,0);
                    }
                }
            }
        }

        if(matrix.get(0).get(0) == 0) {
            for(int j=0; j< size; j++) {
                matrix.get(0).set(j,0);
            }
        }

        if (col1 == 0) {
            for(int i=0; i<size; i++) {
                matrix.get(i).set(0,0);
            }
        }

        for (List<Integer> row: matrix) {
            for (Integer ele: row) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }

    }
}
