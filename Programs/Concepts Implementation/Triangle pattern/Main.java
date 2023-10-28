import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("n: ");
		int n=in.nextInt();
		int space=1;
		int startspace=n-1;
		for(int i=0;i<n;i++){
			System.out.print(" ");
		}
		System.out.println("*");
		for(int j=1;j<n-1;j++){
			for(int i=0;i<startspace;i++){
				System.out.print(" ");
			}
			startspace--;
			System.out.print("*");
			for(int i=1;i<space*2;i++){
				System.out.print(" ");
			}
			space++;
			System.out.println("*");
		}
		for(int i=0;i<n;i++){
			System.out.print(" ");
			System.out.print("*");
		}
	}
}