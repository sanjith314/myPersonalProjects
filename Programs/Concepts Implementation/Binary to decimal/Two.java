import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the binary digit ");
		String s=in.next();
		String s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		double sum=0;
		int power=0;
		for(int i=s1.length()-1;i>=0;i--){
			if(s1.charAt(i)=='1'){
			sum=sum+Math.pow(2,power);
			power++;
			}
			else
				power++;
		}
		System.out.println(sum);
	}	
}