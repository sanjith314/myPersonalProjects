import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter no. of elements in array 1: ");
		int n1=in.nextInt();
		int[] arr1=new int[n1];
		System.out.println("Enter array 1: ");		
		for(int i=0;i<n1;i++){
			arr1[i]=in.nextInt();	
		}
		System.out.println("Enter no. of elements in array 2: ");
		int n2=in.nextInt();
		int[] arr2=new int[n2];
		System.out.println("Enter array 2: ");
		for(int i=0;i<n2;i++){
			arr2[i]=in.nextInt();	
		}
		int[] arr3=new int[n1+n2];
		int m=0;
		for(int k=0;k<n1;k++){
			arr3[m++]=arr1[k];
			arr3[m++]=arr2[k];
		}	
		for(int i=0;i<n2+n1;i++){
			System.out.print(arr3[i]);
		}	
	}
}