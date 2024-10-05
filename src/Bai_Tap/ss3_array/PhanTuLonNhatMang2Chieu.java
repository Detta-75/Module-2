package Bai_Tap.ss3_array;

import java.util.Scanner;

public class PhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = {
                {1.9, 7.5, 7.1},
                {4.0, 2.6, 9.5},
                {2.0, 4.7, 6.4}
        };
        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Gia tri lon nhat:  " + max);
        System.out.println("vị trí của nó là "+ maxRow + maxCol );
    }
}
