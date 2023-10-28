import java.util.Scanner;
import java.util.Arrays;

class Twenty{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		int count=0; 
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		for(int i=0;i<n-1;i++){
			int j=i+1;
				if(arr[i]>arr[j]&&i<n-1&&j<n-1){
					i++;
					j++;}
				while(arr[i]<arr[j]&&i<n-1&&j<n-1){
					j++;	
				}
				count=arr[j]-arr[i];
				i=j;					
		}
		System.out.println(count);
		
	}
}