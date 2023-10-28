import java.util.Scanner;

class Sixty{
	public static void permute(int[] arr, int start, int end){
		if(start==end){
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+"");
			}
			System.out.println("");
			return;
		}
		
		for(int i=start;i<=end;i++){
			swap(arr,start,i);
			permute(arr,start+1,end);
			swap(arr,start,i);
		}
	}
	
	public static void swap(int[] arr, int start, int end){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		permute(arr,0,n-1);
	}
}