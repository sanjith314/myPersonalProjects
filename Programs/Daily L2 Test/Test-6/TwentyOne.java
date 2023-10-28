import java.util.Scanner;

class TwentyOne{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of the matrix: ");
	int n=in.nextInt();
	int[][] arr=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			arr[i][j]=in.nextInt();
		}
	}
	int count=0;
	for(int i=1;i<n-1;i++){
		int j=0;
		if(arr[i][j]==0){
			count++;
		}
	}
	for(int i=1;i<n-1;i++){
		int j=n-1;
		if(arr[i][j]==0){
			count++;
		}
	}
	for(int i=1;i<n-1;i++){
		int j=0;
		if(arr[j][i]==0){
			count++;
		}
	}
	for(int i=1;i<n-1;i++){
		int j=n-1;
		if(arr[j][i]==0){
			count++;
		}
	}
	int side=(n-2)*4;
	if(count==side&&(arr[0][0]!=0)&&(arr[0][n-1]!=0)&&(arr[n-1][0]!=0)&&(arr[n-1][n-1]!=0))
		System.out.println("True");
	else
		System.out.println("False");


	}
}