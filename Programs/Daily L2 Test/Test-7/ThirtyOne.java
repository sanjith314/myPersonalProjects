import java.util.Scanner;

class ThirtyOne{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter element to be added: ");
		int e=in.nextInt();
		System.out.println("Enter the position: ");
		int pos=in.nextInt();
		int[] arr1=new int[n+1];
		int count=0;
		for(int i=0;i<pos;i++){
			arr1[i]=arr[i];
			count++;
		}
		arr1[count]=e;
		for(int i=count+1;i<n;i++){
			arr1[i]=arr[i];	
		}
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]);
		}
	}
}