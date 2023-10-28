import java.util.Scanner;

class Five{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=in.nextInt();
		int n1=0;
		boolean check=false;
		for(int i=0;i<10;i++){
			n1=n1+(n%10)*(n%10);
			n=n/10;
			n1=n1+(n%10)*(n%10);
			
			if(n1==0){
				check=true;
				break;
			}
			n=n1;
			n1=0;
		}
		if(check)
			System.out.println("True");
		else
			System.out.println("False");
		
	}
}