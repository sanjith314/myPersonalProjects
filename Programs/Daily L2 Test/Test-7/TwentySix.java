import java.util.Scanner;
import java.util.Arrays;

class TwentySix{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter no. of elements in aray1: ");
		int n1=in.nextInt();
		int[] arr1=new int[n1];
		System.out.println("Enter array 1");
		for(int i=0;i<n1;i++){
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter no. of elements in aray2: ");
		int n2=in.nextInt();
		int[] arr2=new int[n2];
		System.out.println("Enter array 2");
		for(int i=0;i<n2;i++){
			arr2[i]=in.nextInt();
		}
		int[] arr3=new int[n1+n2];
		for(int i=0;i<n1;i++){
			arr3[i]=arr1[i];
		}
		int j=0;
		for(int i=n1;i<n1+n2;i++){
			arr3[i]=arr2[j++];
		}
		Arrays.sort(arr3);
		System.out.println(arr3[(n1+n2)/2]);
	
	}
}