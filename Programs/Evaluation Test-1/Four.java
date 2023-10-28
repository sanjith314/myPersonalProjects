import java.util.Scanner;

class Four{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=in.nextInt();
		if(n==1||n%6==0||n%6==1){
			System.out.println("Window Seat");}
		else if((n%3==0&&n%6!=0)||(n%6!=0&&n%3==1)){
			System.out.println("Aisle Seat");}
		else{
			System.out.println("Middle Seat");}
	}
}