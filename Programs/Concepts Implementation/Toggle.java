import java.util.Scanner;

class Toggle{

	public static void display(int[][] arr, int m, int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter mxn: ");
		int m=in.nextInt();
		int n=in.nextInt();
		int[][] arr=new int[m][n];
		System.out.println("Enter the matrix: ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=in.nextInt();
			}
		}
	
		while(true){
			System.out.println("Enter 1. for row 2. for column 3. to exit");
			int opt=in.nextInt();
			switch(opt){
				case 1-> {
						System.out.println("Enter row no. to swap");
						int rowopt=in.nextInt();
						for(int j=0;j<n;j++){
							if(arr[rowopt][j]==0)
								arr[rowopt][j]=1;
							else
								arr[rowopt][j]=0;
						}
						display(arr,m,n);
					}
				case 2-> {
						System.out.println("Enter colums no. to swap");
						int columnopt=in.nextInt();
						for(int j=0;j<m;j++){
							if(arr[j][columnopt]==0)
								arr[j][columnopt]=1;
							else
								arr[j][columnopt]=0;
						}
						display(arr,m,n);
					}
				case 3-> System.exit(0);
			}
		}
		
	
	}
}