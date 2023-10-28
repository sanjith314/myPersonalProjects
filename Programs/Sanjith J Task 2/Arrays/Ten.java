import java.util.Arrays;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
