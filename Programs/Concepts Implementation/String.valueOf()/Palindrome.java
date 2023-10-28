import java.util.Scanner;

class Palindrome{
	public static void main(String[] agrs){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the integer");
		int n=in.nextInt();
		String s=String.valueOf(n);
		String s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
			System.out.println("True");
		else
			System.out.println("False");
	}
}