import java.util.Scanner;

class SixtyTwo{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=in.next();
		int space=s.length();
		int letters=1;
		int forr=0;
		for(int i=0;i<=s.length();i++){
			for(int j=space;j>=0;j--){
				System.out.print(" ");
			}
			space--;
			if(letters<s.length()){
				for(int j=s.length()/2;j<=letters;j++){
					System.out.print(s.charAt(j));
				}
				letters++;
			}
			else if(forr<=s.length()/2){	
				for(int j=s.length()/2;j<s.length();j++){
					System.out.print(s.charAt(j));
				}
				for(int j=0;j<=forr;j++){
					System.out.print(s.charAt(j));
				}
				forr++;	
			}
			System.out.println("");			
		}
	}
}
