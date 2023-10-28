import java.util.Scanner;
import java.util.Arrays;

class Twelve{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number: ");
		boolean check=true;
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();		
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			if(arr[i]!=i){
				System.out.println(i);
				check=false;
				break;}
		}
		if(check)
			System.out.println(n);
}
}