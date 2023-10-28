// Need to complete

import java.util.Scanner;

class TwentyFour{

    static void zero(int[][] arr1, int i,int j, int n){
        for(int k=0;k<n;k++){
            arr1[i][k]=0;
        }
        for(int k=0;k<n;k++){
            arr1[k][j]=0;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] != 0)
                    arr1[i][j] = arr[i][j];
                else
                    zero(arr1, i, j, n);

            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j]);
                }
		System.out.println("");
            }

    }}