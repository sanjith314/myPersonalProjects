import java.util.Scanner;

class Fourteen{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=in.nextInt();
		int n1=0,n2=1;
		int temp; 
		for(int i=2;i<n;i++){
			temp=n2;
			n2=n2+n1;
			n1=temp;
			
		}
		System.out.println(n1+n2);
}
}
