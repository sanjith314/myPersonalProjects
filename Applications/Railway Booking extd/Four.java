import java.util.Scanner;

class Four{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}
}