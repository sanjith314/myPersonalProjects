import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		int space=n;
		int count=1;
		for(int i=0;i<5;i++){
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
	}
}