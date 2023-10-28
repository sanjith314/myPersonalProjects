import java.util.Scanner;

class TwentySeven{

	public static void clockwise(int[] arr, int n, int r){
		int[] arr1=new int[n];
		int j=0;
		for(int i=r;i<n;i++){		
			arr1[j]= arr[i];
			j++;
		}
		for(int i=0;i<r;i++){
			arr1[j]=arr[i];
			j++;
			
		}
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]);
		}
	}

	public static void anti(int[] arr, int n, int r){
		int[] arr2=new int[n];
		int j=0;
		for(int i=n-r;i<n;i++){
			arr2[j]=arr[i];
			j++;	
		}
		for(int i=0;i<n-r;i++){		
			arr2[j]= arr[i];
			j++;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr2[i]);
		}
	}	
	
	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n=in.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=in.nextInt();
	}
	System.out.println("Enter the number of rotations: ");
	int r=in.nextInt();
	System.out.println("Enter 1 for clockwise and 2 for anti clockwise rotation");
	int dir=in.nextInt();
	if(dir==1)
		clockwise(arr,n,r);
	else if(dir==2)
		anti(arr,n,r);
	else
		System.out.println("Enter a valid input");
	
	}		
}