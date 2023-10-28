import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of numeric array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            arr[i] = in.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}