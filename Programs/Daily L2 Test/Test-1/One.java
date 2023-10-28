import java.util.Scanner;
public class One{
	public static void main(String[]  args){
			
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the number of elements in the array: ");
	int n=in.nextInt();
	Boolean check= true;
	System.out.println("Enter the array: ");
	int[] arr= new int[n];
	for(int i=0;i<n;i++){
		arr[i]= in.nextInt();
	}
	int temp=0;
//	int smallest=arr[0];
	for(int i=1;i<n;i++){
		for(int j=i;j<n;j++){
			if(arr[j]<arr[i]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}	
		}
	}
	for(int i=1;i<n;i++){
		if(arr[i]==arr[i-1]+1){
			check=true;
		}
		else{ check= false; 
		      break;
		}
	}
	if(check){
	System.out.println("Yes");}
	else{
	System.out.println("N0");}
	
}
	
}