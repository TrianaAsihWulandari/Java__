package day02;

import java.util.Random;

public class Matrix {

    public static void main(String[] args) {

        var matrix2 = new int[][] {
                {1,2,3},
                {3,4,5},
                {6,7,8},
        };

/*        displayMatrix(matrix2);
        System.out.println();

        displayMatrix(fillMatrixRandom(5));
        System.out.println();
        displayMatrix(matrixDiagonal(5));
        System.out.println();
        displayMatrix(matrixDiagonal2(5));
        System.out.println();*/
        displayMatrix(matrix4(8));

    }

    public static int[][] matrix4(int n){
        int[][]matrix = new int[n][n];

        int total = 0;

        for (int row = 0; row < matrix.length-1; row++) {
            int sum =0;
            for (int col = 0; col < matrix[row].length-1; col++) {
                //mulai isi baris kolom matrix
                matrix[row][col]=col+row;

                // untuk memudahkan penjumlahan kita gunakan sum & total
                sum = col+row;
                total += sum;

                //isi kolom terakhir dengan sum
                matrix[row][matrix.length-1] += sum;

                //isi baris terkahir dengan sum
                matrix[matrix.length-1][col] += sum;
            }
        }
        // jika n=8, maka kita isi value di matrix[6][6]=total
        matrix[matrix.length-1][matrix.length-1]=total;
        return matrix;
    }

    public static int[][] matrixDiagonal(int n){
        int[][]matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col){
                    matrix[row][col]= matrix.length-1-row;
                }
                if (col > row){
                    matrix[row][col]=10;
                }else if (row > col){
                    matrix[row][col]=20;
                }
            }
        }
        return matrix;
    }

    public static int[][] matrixDiagonal2(int n){
        int[][]matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col){
                    matrix[row][col]= col-1;
                }
                if (col > row){
                    matrix[row][col]=20;
                }else if (row > col){
                    matrix[row][col]=10;
                }
            }
        }
        return matrix;
    }



    public static void displayMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length ; col++) {
                System.out.printf("%3s", matrix[row][col]);
            }
            System.out.println();
        }

    }


    public static int[][] fillMatrixRandom(int n){
        int[][]matrix = new int[n][n];

        Random random = new Random();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]= random.nextInt(11);
            }
        }
        return matrix;
    }



    public static void initMatrix(){
        int[][] matrix = new int[2][2];
        matrix[0][1]=10;
        var matrix2 = new int[][] {
                {1,2,3},
                {3,4,5},
                {6,7,8},
        };
    }


}
