import java.util.Scanner;

class Three{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int n1=0,n2=0;
		int greatest=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j){
					if(arr[i]%arr[j]>greatest){
						greatest=arr[i]%arr[j];
						n1=arr[i];
						n2=arr[j];				
					}
				}
			}
		}
		System.out.println(n1+" "+n2);

	}
}