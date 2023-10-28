import java.util.Scanner;

class Five{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Number of input: ");
		int n=in.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=in.next();
		}		
		
	}
}