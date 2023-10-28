//Need to complete
	
import java.util.Scanner;

class TwentyEight{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int sum;
		for(int i=0;i<n;i++){
			sum=0;
			for(int j=0;j<i;j++){
				sum+=arr[j];
			}
			if(sum==0&&i!=0){
				for(int k=0;k<i;i++){
					System.out.print(arr[k]);
				}
			}
		}
	}	
}