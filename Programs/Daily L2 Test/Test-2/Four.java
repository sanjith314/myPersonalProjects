import java.util.Scanner;

public class Four{
	static int count=1;
	public static int recc(int[][] arr,int i, int j, int n){
		if(i<n-1&&j<n-1&&i>0&&j>0){
		if(arr[i+1][j]==1||arr[i-1][j]==1||arr[i][j+1]==1||arr[i][j-1]==1){
			return count;
		}
		else{
			return count++;
//			return recc(arr,i,j,n);
		}
		}
		else{
			return 0;
		}
	}
	

	public static void main(String[]  args){
			
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the martix size: ");
	int n=in.nextInt();
	int[][] arr=new int[n][n];
	int ans;
	System.out.println("Enter the martix: ");
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			arr[i][j]=in.nextInt();
				
		}		
	}
	int[][] arr1=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(arr[i][j]!=0){
				ans=recc(arr,i,j,n);
				arr1[i][j]=ans;						
			}	
			else{
				arr1[i][j]=0;
			}
			System.out.print(arr1[i][j]);
		
		}		
	}
	
	
	
}
}