// Need to complete
//Use if statements instead of while loop

import java.util.Scanner;

class TwentyFive{
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the size of the matrix: ");
	int n=in.nextInt();
	int count=1;
	int[][] arr=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			arr[i][j]=in.nextInt();
		}
	}
	int i=0,j=0;
//	while((arr[i+1][j+1]==0||arr[i][j+1]==0||arr[i+1][j]==0)&&i<n-1&&j<n-1){
//		count++; i++; j++;}
	while(i<n-1&&j<n-1){
		if(arr[i+1][j+1]==0){
			count++; i++; j++;}
		else if(arr[i][j+1]==0){
			count++; j++;}
		else if(arr[i+1][j]==0){
			count++; i++;}
	}

	
	System.out.println(count);
	}
}
	