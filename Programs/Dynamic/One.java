import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter s: ");
		String s=in.next();
		System.out.println("Enter t: ");
		String t=in.next();
		int check=0;
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)==s.charAt(check)){
				check++;
			}
		}	
		if(check>=s.length()	)
			System.out.println("True");
		else
			System.out.println("False");
	}	
}