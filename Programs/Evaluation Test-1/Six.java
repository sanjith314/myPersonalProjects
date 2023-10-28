import java.util.Scanner;

class Six{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n=in.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter the 1st array");
		for(int i=0;i<n;i++){
			arr1[i]=in.nextInt();
		}
		int[] arr2=new int[n];
		System.out.println("Enter the 2nd array");
		for(int i=0;i<n;i++){
			arr2[i]=in.nextInt();
		}
		int smallest=arr1[0]+arr2[0];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j){
					if(arr1[i]+arr2[i]<smallest);
						smallest=j-1;
				}
			}
		}
		System.out.println(smallest);
	}
}