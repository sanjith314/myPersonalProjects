import java.util.Scanner;

class Three{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		if(n%2==0)
			System.out.println("True");
		else
			System.out.println("False");
	}	
}