import java.util.Scanner;

class Armstrong{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number: ");
		String s=in.next();
		int pow=s.length();
		int sum=0;
		for(int i=0;i<s.length();i++){
			sum+=Math.pow(s.charAt(i)-'0',pow);
		}
		if(s.equals(Integer.toString(sum)))
			System.out.println("Armstrong number");
		else
			System.out.println("No");
	}
}