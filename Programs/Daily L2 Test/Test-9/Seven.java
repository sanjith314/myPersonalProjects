import java.util.Scanner;

class Seven{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=in.nextInt();
		
		int[][] arr=new int[n][n];
		
		int value =1;
		
		int i=0,j=0;	
		int firstlimit=n;
		int secondlimit=n;
		int thirdlimit=0;
		int fourthlimit=0;
		for(int k=0;k<=n;k++){
		if(i<n&&j<n&&thirdlimit>=0&&fourthlimit>=0&&value<=n*n){
		while(j<firstlimit){
			arr[i][j]=value;
			value++;
			j++;	
		}
		firstlimit-=2;	
		while(i<secondlimit){
			arr[i][j]=value;
			value++;
			i++;	
		}
		secondlimit-=2;
		while(i>=thirdlimit){
			arr[i][j]=value;
			value++;
			i--;	
		}
		thirdlimit+=2;
		while(j>fourthlimit){
			arr[i][j]=value;
			value++;
			j--;	
		}
		fourthlimit+=2;
		firstlimit--;}
		else
			break;
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}