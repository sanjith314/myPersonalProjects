import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }

        boolean check = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (arr[i] + arr[j] == 0) {
                    check = true;
                    break;
                }
            }
        }
        if(check){
            System.out.println("It is true");
        }
        else{
            System.out.println("It is false");
        }
    }
}
