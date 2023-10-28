import java.util.Scanner;
public class Six{
	public static void main(String[]  args){
			
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the first string: ");
	String s1=in.nextLine();
	
	System.out.println("Enter the second string: ");
	String s2=in.nextLine();
	int count=0;
	for(int i=0;i<s2.length();i++){
		for(int j=0;j<s1.length();j++){
			if(s2.charAt(i)==s1.charAt(j)){
				count++;
			}
		}
	}
	if(count==s2.length()){
		System.out.println("Yes");
	}
	else{
	System.out.println("No");}
	
}
}