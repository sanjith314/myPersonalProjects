import java.util.Scanner;

class Seven{
	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=in.nextInt();
	int space=n-1;
	int count=0;
	boolean check=false;
	for(int i=1;i<=n;i++){
		for(int j=space;j>=0;j--){
			System.out.print(" ");
		}
		space--;
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
		count++;
		if(check){
		for(int j=count-1;j>0;j--)
			System.out.print(j);	
		}
		check=true;
		System.out.println("");
	}	
	}
}