import java.util.Scanner;

class Four{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		int[][] arr=new int[n][n];
		System.out.println("Enter the matrix: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=in.nextInt();
			}
		}
		int lim=n;
		int lsum=0,rsum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<lim;j++){
				lsum+=arr[i][j];
			}
			lim--;
		}
		lim=n-1;
		for(int i=0;i<n;i++){
			for(int j=n-1;j>=lim;j--){
				rsum+=arr[i][j];
			}
			lim--;
		}
		if(lsum>=rsum)
			System.out.println(lsum);
		else	
			System.out.println(rsum);
	}
}