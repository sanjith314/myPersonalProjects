import java.util.Scanner;

class Eleven{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the number: ");
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			if(i*i*i*i==n){
				check=true;
				break;}
		}
		if(check)
			System.out.println("True");
		else
			System.out.println("False");
	}
}