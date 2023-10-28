import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first matrix: ");
        int[][] arr1 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        int[][] arr2= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=in.nextInt();
            }
        }
        int[][] arr3=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The final matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr3[i][j]);
            }
        }
    }


}
