import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		int space=n;
		int count=1;
		for(int i=0;i<n;i++){
				for(int k=space;k>0;k--){
					System.out.print(" ");
				}
				space--;
				for(int k=1;k<=count;k++){
					System.out.print("* ");
				}
				count++;
				
				System.out.println("");
		}
		int revcount=n-1;
		int revspace=1;
		for(int i=0;i<n;i++){
				for(int k=1;k<=revspace;k++){
					System.out.print(" ");
				} 
				revspace++;
				for(int k=revcount;k>0;k--){
					System.out.print(" *");
				}
				revcount--;
				
				
				System.out.println("");
		}
		
	}
}