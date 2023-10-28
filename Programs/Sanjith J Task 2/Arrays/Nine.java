import java.util.Arrays;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the length of first array: ");
        int p= in.nextInt();
        int[] arrA= new int[p];
        System.out.println("Enter 1st array elements: ");
        for(int i=0;i<p;i++){
            arrA[i]= in.nextInt();
        }
        System.out.println("Enter the length of the second array: ");
        int q= in.nextInt();
        int[] arrB= new int[q];
        System.out.println("Enter 2nd array elements: ");
        for(int i=0;i<q;i++){
            arrB[i]= in.nextInt();
        }

        int[] arr= new int[p+q];
        int[] arr1= new int[p];
        int[] arr2= new int[q];

//        for(int i=0;i<p;i++){
//            arr[i]= arrA[i];
//        }
//        for(int i=0;i<q;i++){
//            arr[p+i-1]= arrB[i];
//        }

        System.arraycopy(arrA,0,arr,0,p);
        System.arraycopy(arrB, 0, arr, p, q);
        Arrays.sort(arr);
//        for(int i=0;i<p+q;i++){
//            System.out.print(arr[i]);
//        }

        for(int i=0;i<p;i++){
            arr1[i]= arr[i];
        }
        for(int i=0;i<q;i++){
            arr2[i]= arr[p+i];
        }

        System.out.println("Arr1= ");
        for(int i=0;i<p;i++){
            System.out.print(arr1[i]);
        }
        System.out.println(" ");
        System.out.println("Arr2= ");
        for(int i=0;i<q;i++){
            System.out.print(arr2[i]);
        }
    }
}
