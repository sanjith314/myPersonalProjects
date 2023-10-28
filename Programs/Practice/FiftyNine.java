import java.util.Scanner;

class FiftyNine{
	public static void permute(char[] arr, int start, int end){
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
	
	public static void swap(char[] arr, int start, int end){
		char temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=in.next();
		char[] arr=s.toCharArray();
		System.out.println("Enter the array: ");
		permute(arr,0,s.length()-1);
	}
}