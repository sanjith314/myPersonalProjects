import java.util.Scanner;

class Fifteen{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the String: ");
		String s=in.next();
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)=='('){
				for(int j=i+1;j<s.length();j++){
					if(s.charAt(j)==')')
						check=true;
				}
				if(!check)
					break;
			}
			else if(s.charAt(i)=='{'){
				for(int j=i+1;j<s.length();j++){
					if(s.charAt(j)=='}')
						check=true;
				}
				if(!check)
					break;
			}
			else if(s.charAt(i)=='['){
				for(int j=i+1;j<s.length();j++){
					if(s.charAt(j)==']')
						check=true;
				}
				if(!check)
					break;
			}
		}
		if(check)
			System.out.println("True");
		else
			System.out.println("False");
}
}