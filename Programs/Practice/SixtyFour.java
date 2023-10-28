import java.util.Scanner;

class SixtyFour{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=in.next();
		int count=0;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)=='1'){
				for(int j=i+1;j<s.length();j++){
					if(s.charAt(j)=='1'){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}