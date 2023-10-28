import java.util.Scanner;

class Five{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("* ");
		}
		System.out.println("");
		int initial=1;
		int after=n;
		for(int i=0;i<n-1;i++){
			for(int j=1;j<=initial;j++){
				System.out.print(" ");	
			}
			initial++;
			System.out.print("*");
			for(int j=after;j>0;j--){
				System.out.print(" ");
			}
			after-=2;
			if(i<n-2)
				System.out.println("*");
			
//			System.out.println("");
		}
	}
}