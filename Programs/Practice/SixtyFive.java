import java.util.Scanner;

class SixtyFive{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		String s="";
		for(int i=0;i<n-1;i+=2){
			if(arr[i+1]==0)
				s=arr[i]+s;
			else
				s=s+arr[i];
		}
		System.out.println(s);
		
	}
}
