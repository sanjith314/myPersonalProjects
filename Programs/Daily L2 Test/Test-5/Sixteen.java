import java.util.Scanner;

class Sixteen{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        System.out.println("Enter no. of elements in 1st array: ");
        int n1=in.nextInt();
        int[] arr1= new int[n1];
        System.out.println("Enter the first array: ");
        for(int i=0;i<n1;i++)
            arr1[i]=in.nextInt();

        System.out.println("Enter no. of elements in 2nd array: ");
        int n2=in.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter the second array: ");
        for(int i=0;i<n2;i++)
            arr2[i]=in.nextInt();

        int[] arr3=new int[n1];
        boolean check=false;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2-1;j++){
                if(arr1[i]==arr2[j]&&arr2[j+1]>arr1[i]){
                    arr3[i]=arr2[j+1];
                    check=true;
                    break;
                }
                else if(arr1[i]==arr2[n2-1]){
                    arr3[i]=-1;
                    check=true;}
            }
            if(!check)
                arr3[i]=-1;
        }
        for(int i=0;i<n1;i++)
            System.out.print(arr3[i]);
    }
}