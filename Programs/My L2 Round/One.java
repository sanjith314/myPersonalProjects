import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= in.nextInt();
		StringBuilder s=new StringBuilder();
		int i=n;
		while(i>0){
			s.append(i%2);
			i=i/2;
		}
		int count=0;
		for(int j=0;j<s.length();j++){
			if(s.charAt(j)=='1')
				count++;
		}
		System.out.println(count);
	}
}