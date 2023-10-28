import java.util.Scanner;
	
class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=in.next();
		String s1="";
		s1=s1+s.charAt(0);
		boolean check=true;
		for(int i=1;i<s.length();i++){
			for(int j=0;j<s1.length();j++){
				if(s.charAt(i)==s1.charAt(j)){
					check=false;
				}
			}	
			if(check)
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}