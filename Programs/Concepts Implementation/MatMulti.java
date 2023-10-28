import java.util.Scanner;

class MatMulti{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter r1 and c1: ");
		int r1=in.nextInt();
		int c1=	in.nextInt();
		System.out.println("Enter r2 and c2: ");
		int r2=in.nextInt();
		int c2=	in.nextInt();
		int[][] arr1=new int[r1][c1];
		System.out.println("Enter matrix1: ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				arr1[i][j]=in.nextInt();
			}
		}
		int[][] arr2=new int[r2][c2];
		System.out.println("Enter matrix2: ");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				arr2[i][j]=in.nextInt();
			}
		}
		int[][] sum=new int[r1][c2];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<r2;k++){
					sum[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		System.out.println("Answer");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("");
		}
	}
}