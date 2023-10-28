import java.util.Scanner;

class Num{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		int count;
		int rcount;
		for(int i=0;i<=n;i++){
			count=0;
			rcount=0;
			for(int j=i;j<n;j++){
				System.out.print(" ");
				count++;
			}
			for(int j=n-count;j>0;j--){
				System.out.print(j);
				rcount++;
			}
			if(!(count==n-1)){
				for(int j=2;j<=rcount;j++){
					System.out.print(j);
				}
			}
			System.out.println("");
		}
		count=0;rcount=0;
		for(int i=0;i<n;i++){
			count=0;
			rcount=0;
			for(int j=0;j<=i;j++){
				System.out.print(" ");
				count++;
			}
			for(int j=n-count;j>0;j--){
				System.out.print(j);
				rcount++;
			}
			for(int j=2;j<=rcount;j++){
				System.out.print(j);
			}

			System.out.println("");
		}
		
	}
}