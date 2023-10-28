import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target value: ");
        int t= in.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
