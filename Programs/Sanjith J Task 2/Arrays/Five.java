import java.util.Arrays;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int[] arr2= new int[n];
        int j=n-1;
        int temp=0;
        for(int i=0;i<n;i++){
                arr2[i]=arr[j];
                i++;
                arr2[i]=arr[temp++];
                j--;
        }
        if(n%2!=0){
            int num=n-(n/2)-1;
            arr2[n-1]=num;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }
}
