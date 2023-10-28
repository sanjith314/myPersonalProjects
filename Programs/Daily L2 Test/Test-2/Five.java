import java.util.Scanner;

class Five{
	public static void main(String[] args){

	Scanner in= new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n= in.nextInt();
	int[] arr= new int[n];
	for(int i=0;i<n;i++){
		arr[i]=in.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			for(int k=j+1;k<n;k++){
				if(arr[i]+arr[j]+arr[k]==0){
					System.out.print(arr[i]);
					System.out.print(arr[j]);
					System.out.println(arr[k]);
				}
			}
		}
	}
}
}