import java.util.Scanner;

class Five{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter no. of elements in the array: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int sum1;
		int sum2;
		boolean check=false;
		for(int i=1;i<n-1;i++){
			sum1=0;
			sum2=0;
			for(int j=0;j<i;j++){
				sum1+=arr[j];
			}
			for(int j=i+1;j<n;j++){
				sum2+=arr[j];
			}
			if(sum1==sum2)
				check=true;
		}
		if(check)
			System.out.println("True");
		else
			System.out.println("False");
	}	
}