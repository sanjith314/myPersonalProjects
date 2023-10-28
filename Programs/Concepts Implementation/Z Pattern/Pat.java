import java.util.Scanner;

class Pat{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("*");
		}
		System.out.println("");
		int k=n-2;
		for(int i=0;i<n-2;i++){
			for(int j=k;j>0;j--){
				System.out.print(" ");
			}
			System.out.println("*");
			k--;
		}
		for(int i=0;i<n;i++){
			System.out.print("*");
		}
	}
}