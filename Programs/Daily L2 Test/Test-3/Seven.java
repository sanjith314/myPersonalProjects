import java.util.Scanner;

class Seven{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the string: ");
		String s=in.nextLine();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				count++;
			}		
		}
		System.out.println(s.length()*count);
}
}