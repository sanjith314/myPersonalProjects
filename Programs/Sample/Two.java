import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int row=in.nextInt();	
		int col;
		int[][] arr=new int[row][];
		
		for(int i=0;i<row;i++){
			System.out.println("Enter the number of columns ");
			col=in.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<col;j++){
				arr[i][j]=in.nextInt();	
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}	
}