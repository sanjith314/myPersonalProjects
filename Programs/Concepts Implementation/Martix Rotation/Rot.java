import java.util.Scanner;

class Rot{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		int[][] arr=new int[3][3];
		int[][] arr1=new int[3][3];
		System.out.println("Enter the matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr1[i][j]=arr[j][i];
			}
		}
		int k=2;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=arr1[k][j];
			}
			k--;
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}