import java.util.Scanner;
public class Two{
	public static void main(String[]  args){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n=in.nextInt();
	int[] arr= new int[n];
	System.out.println("Enter the covid cases: ");
	for(int i=0;i<n;i++){
		arr[i]= in.nextInt();
	}
	System.out.println("Enter value of K: ");
	int k=in.nextInt();
	int count=0;
	int sum=0;
	for(int i=0;i<n;i++){
		if(arr[i]<=k){
			continue;
		}
		else{
			count+=arr[i]-k;
		}	
	}
	if(count!=n){
		if(count>3){
		sum=n+count/3;}
//		else{
//		sum=n+1;}
	}
	else{
		sum=n;
	}
	System.out.println(sum);
}
}
