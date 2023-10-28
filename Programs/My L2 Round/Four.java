import java.util.Scanner;
import java.util.Arrays;

class Four{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("M: ");
		int m=in.nextInt();
		System.out.println("N: ");
		int n=in.nextInt();
		System.out.println("X: ");
		int x=in.nextInt();
		int[] arr=new int[x];
		int[] arr1=new int[x];
		System.out.println("Enter the array: ");
		for(int i=0;i<x;i++){
			arr[i]=in.nextInt();
		}
		
		int a=0;
		//Arrays.sort(arr);
		for(int i=0;i<x;i++){
			if(arr[i]==0){}
			else if(m%arr[i]==0)
				arr1[a++]=arr[i];		
		}
		for(int i=0;i<x;i++){
			if(arr[i]==0){}
			else if(n%arr[i]==0&&(m%arr[i]!=0)){	
				arr1[a++]=arr[i];	
				}		
		}
		for(int i=0;i<x;i++)
			if(arr[i]==0)
				arr1[a++]=arr[i];	
			else if((m%arr[i]!=0)&&(n%arr[i]!=0))
				arr1[a++]=arr[i];
		for(int i=0;i<x;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}