import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=2;i<n;i++){
			if(arr[i-1]<arr[i-2])
				arr[i]=arr[i-1]+arr[i];
			else
				arr[i]=arr[i-2]+arr[i];
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		if(arr[n-1]<arr[n-2])
			System.out.println(arr[n-1]);
		else if(arr[n-2]<arr[n-1])
			System.out.println(arr[n-2]);
									
	}
}