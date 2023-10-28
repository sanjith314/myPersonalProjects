import java.util.Scanner;

class Spiral{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		int[][] arr=new int[n][n];
		
		int r1=0,r2=n-1;
		int c1=0,c2=n-1;
		int val=1;
		while(r1<=r2&&c1<=c2){
			for(int i=r1;i<=c2;i++){
				arr[r1][i]=val++;
			}
			for(int i=r1+1;i<=r2;i++){
				arr[i][c2]=val++;
			}
			if(r1<r2&&c1<c2){
				for(int i=c2-1;i>c1;i--){
					arr[r2][i]=val++;
				}
				for(int i=r2;i>r1;i--){
					arr[i][c1]=val++;
				}
			}
			c1++;
			c2--;
			r1++;
			r2--;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
	}
}