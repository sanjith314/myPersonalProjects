import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=in.next();
		int multi;
		String ans="";
		for(int i=0;i<s.length()-1;i++){
			multi=0;
			while(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				multi=multi*10+(s.charAt(i)-'0');
				i++;
			}		
			for(int j=1;j<=multi;j++){
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
	}
}