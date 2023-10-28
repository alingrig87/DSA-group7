package org.example;

public class W02_PrintingPatterns {

    public static void trianglePattern1(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle(int n) {
        for(int row = 1; row <= n; row++) {

            int currentValue = 1;
            for(int column = 1; column <= row; column++) {
                System.out.print(currentValue + " ");
                // current ....
                currentValue = currentValue * (row - column) / column;
            }
            System.out.println();
        }
    }

    // refactor using row and column instead of i and j
    public static void printPascalTriangle1(int n) {
        int[][] matrix = new int[100][100];

        for (int i=1; i <= n; i++) {
            for (int j=1; j<= i; j++) {
                matrix[i][j] = 1;

                if ((1<j)&&(j<i)) {
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
                }
            }
        }

        for (int i=1; i <= n; i++) {
            for (int j=1; j<= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascalTriangle(5);
    }
}
