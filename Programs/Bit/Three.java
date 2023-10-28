import java.util.Scanner;

class Three{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		int greatest=0;
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			if(arr[i]>greatest)
				greatest=arr[i];
		}
		System.out.println("Enter k: ");
		int k=in.nextInt();
		int count=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(i!=j&&i!=greatest&&j!=greatest){
					if(arr[i]+arr[j]==greatest){
						count++;
						break;	
					}
				}
			}
		}
		if(count+1==k)
			System.out.println("True");
		else
			System.out.println("False");
	}
}