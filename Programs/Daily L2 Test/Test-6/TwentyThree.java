import java.util.Scanner;

class TwentyThree{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of the matrix: ");
	int n=in.nextInt();
	int[][] arr=new int[n][n];
	int count=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			arr[i][j]=in.nextInt();
			if(arr[i][j]<0)
				count++;
		}
	}
	System.out.println(count);

	}
}