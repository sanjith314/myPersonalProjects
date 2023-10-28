import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= in.nextInt();
        int arr[]= new int[n+1];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<n-1;i++){
            boolean check=true;
            for (int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    check=true;
                }
                else{
                    check=false;
                }
            }
            if(check==true){
                System.out.println(arr[i]);
            }
        }

    }
}
