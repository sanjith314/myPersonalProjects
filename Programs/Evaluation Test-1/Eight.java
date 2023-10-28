import java.util.Scanner;

class Eight{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int flag=n;
		int count=5;
		int dec=0;
		for(int i=0;i<n;i++){
			count++;
			for(int j=0;j<=flag;j++){
				System.out.print(n);
				count--;
			}
			flag--;
			for(int j=flag;j<n-dec;j++){
				System.out.print(flag);
			}
			dec++;
			System.out.println("");
		}
	
	}
}