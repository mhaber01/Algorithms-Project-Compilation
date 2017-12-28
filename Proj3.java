// The Product of two 4x4 Matrices

import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {
        int row, col;
        int sum = 0;

        int[][] A= new int[4][4];
        int[][] B= new int[4][4];
        int[][] C = new int[4][4];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Matrix A:");
        for (row = 0; row < 4; row++){
            System.out.print("Enter 4 Numbers: ");
            for (col = 0; col < 4; col++){
                A[row][col] = input.nextInt();
            }
        }
        
        System.out.println("Matrix B:");
        for (row = 0; row < 4; row++){
            System.out.print("Enter 4 numbers: ");
            for (col = 0; col < 4; col++){
                B[row][col] = input.nextInt();
            }
        }
        
        for (row = 0; row < 4; row++){
            for (col = 0; col < 4; col++){
                for (int k = 0; k < 4; k++){
                    sum += A[row][k]*B[k][col];
                }
                C[row][col] = sum;
                sum = 0;
            }
        }
        
        System.out.println("Martix C: The product AB is ");
        for(int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
