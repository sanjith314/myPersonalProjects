import java.util.Scanner;

class Three{
	public static void main(String[] args){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter n: ");
	int n=in.nextInt();
	int revcount=n-1;
	int revspace=1;
	for(int i=0;i<n;i++){
				for(int k=1;k<=revspace;k++){
					System.out.print(" ");
				} 
				revspace++;
				for(int k=revcount;k>=0;k--){
					System.out.print(" *");
				}
				revcount--;
				
				
				System.out.println("");
		}
	}
}