import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=in.next();
		StringBuilder ans=new StringBuilder();
		int ucount=0,lcount=0;
		for(int i=0;i<s.length();i++){
				if(s.charAt(i)==Character.toUpperCase(s.charAt(i)))
					ucount++;
				else if(s.charAt(i)==Character.toLowerCase(s.charAt(i)))
					lcount++;
		}
		char[] lower=new char[lcount];
		char[] upper=new char[ucount];
		int low=0;
		int up=0;
		for(int i=0;i<s.length();i++){
				if(s.charAt(i)==Character.toUpperCase(s.charAt(i)))
					upper[up++]=s.charAt(i);
				else if(s.charAt(i)==Character.toLowerCase(s.charAt(i)))
					lower[low++]=s.charAt(i);
		}
		low=0;
		up=0;
		Arrays.sort(upper);
		Arrays.sort(lower);

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==Character.toUpperCase(s.charAt(i)))
				ans.append(upper[up++]);
			else if(s.charAt(i)==Character.toLowerCase(s.charAt(i)))
				ans.append(lower[low++]);
		}
		System.out.println(ans);
	}
}