import java.util.Scanner;

class Binary{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=in.next();
		System.out.println("Enter the second string");
		String s2=in.next();
		int i=s1.length()-1;
		int j=s2.length()-1;
		StringBuilder s3= new StringBuilder();
		int carry=0;
		
		while(i>=0||j>=0){
			int sum=carry;
			if(j>=0)
				sum+=s2.charAt(j--)-'0';
			if(i>=0)
				sum+=s1.charAt(i--)-'0';
			
			s3.append(sum%2);
			carry=sum/2;
		}
		if(carry!=0)
			s3.append(carry);
		System.out.println(s3.reverse().toString());
	}
}	