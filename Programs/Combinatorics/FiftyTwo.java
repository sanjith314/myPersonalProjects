import java.util.Scanner;

class FiftyTwo{
	
	public static int recc(int m,int n){
		if(m==1 || n==1)
			return 1;
		else
			return recc(m-1,n) + recc(m, n-1);
	}
	
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter row x column");
		int m=in.nextInt();
		int n=in.nextInt();
		System.out.println(recc(m,n));
	}	
}