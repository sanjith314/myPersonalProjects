import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=in.nextInt();
		String s="";
		int i=n;
		while(i>0){
			s=s+i%2;
			i=i/2;
		}
		System.out.println(s);
	}
}