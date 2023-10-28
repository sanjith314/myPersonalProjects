import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                }
            }
        }
        arr[n-1]=-1;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
