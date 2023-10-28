import java.util.Scanner;

class Ten{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the target: ");
		int t=in.nextInt();
		System.out.println("Enter the number of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			if(arr[i]==t)
				System.out.println(i);
		}
}
}