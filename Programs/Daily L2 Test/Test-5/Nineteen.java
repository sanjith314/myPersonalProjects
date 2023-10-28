import java.util.Scanner;
import java.util.Arrays;

class Nineteen{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			if(arr[i]!=i){
				System.out.println("Missing element is: "+i);
				break;}
		}
	}
}