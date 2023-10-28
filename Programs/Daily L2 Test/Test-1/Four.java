import java.util.Scanner;
public class Four{
	public static void main(String[]  args){

	Scanner in= new Scanner(System.in);
	System.out.println("Enter the length of the array: ");
	int n= in.nextInt();
	
	int[] arr= new int[n];
	int[] arr1= new int[n];
	int[] arr2= new int[n];
//	int[] arr3= new int[n];
	System.out.println("Enter the the array: ");
	for(int i=0;i<n;i++){
		arr[i]= in.nextInt();
	}
	int count=0;
	int p=0;
	int q=0;
	for(int i=0;i<n;i++){
		
		if(arr[i]>0){
			arr1[p]=arr[i];
			p++;
			count++;
		}
		else{
			arr2[q]=arr[i];
			q++;
		}
	}
	p=0;
	for(int i=count;i<n;i++){	
		
		arr1[i]=arr2[p];
		p++;
	}
	for(int i=0;i<n;i++){
		System.out.println(arr1[i]);
	}

}
}