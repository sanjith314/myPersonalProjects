import java.util.Scanner;

class TwentyTwo{
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
	for(int i=n;i>0;i--)
		count+=i;
	int sum=0;
	boolean check=true;
	for(int i=0;i<n;i++){
		sum=0;	
		for(int j=0;j<n;j++){
			sum+=arr[i][j];
		}
		if(sum!=count){
			check=false;
			break; }
	}
	
	if(check)
		System.out.println("Valid");
	else
		System.out.println("Invalid");

	}
}