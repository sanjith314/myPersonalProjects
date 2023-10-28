// need to check - Swap 0s to last

import java.util.Scanner;

class Three{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();	
		}
		int temp;
		for(int i=0;i<n-1;i++){
			if(arr[i]==0){
				arr[i]=arr[i+1];
				arr[i+1]=0;
			}
		}
		for(int i=0;i<n-1;i++){
			if(arr[i]==0){
				arr[i]=arr[i+1];
				arr[i+1]=0;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);	
		}	
	}
}