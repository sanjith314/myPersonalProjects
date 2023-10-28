import java.util.Scanner;

class Fib{

	public static void fib(int n1, int n2, int n, int count){
		int n3;
		System.out.print(n2+" ");
		count++;
		if(count<n)
			fib(n2, n1+n2, n, count);
		
	}
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=in.nextInt();
		int n1=0,n2=1;
		System.out.print(n1+" ");
		fib(n1,n2,n,1);
	}
}