import java.util.Scanner;

class BinarySearch{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n=in.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the array: ");
	for(int i=0;i<n;i++){
		arr[i]=in.nextInt();	
	}
	System.out.println("Enter the element to be searched: ");
	int k=in.nextInt();
	int start=0;
	int end=n-1;
	int middle=n/2;

	while(start<=end){
		if(k<arr[middle])
			end=middle-1;
		else if(k==arr[middle]){
			System.out.println("Found in position "+middle);
			break;}
		else
			start=middle+1;

		middle=(start+end)/2;

	}	
	if(start>end)
		System.out.println("Element not found");
}
}