import java.util.Scanner;

class Chess{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int[][] arr=new int[12][12];
        arr[3][4]=9;
        for(int i=2;i<=9;i++){
            for(int j=2;j<=9;j++){
                if((arr[i][j]!=9)&&(arr[i-2][j-1]==9||arr[i-1][j-2]==9||arr[i+2][j+1]==9||arr[i+1][j-2]==9||arr[i-1][j+2]==9||arr[i+1][j+2]==9||arr[i-2][j+1]==9))
                    arr[i][j]=1;
            }
        }
        for(int i=2;i<=9;i++){
            for(int j=2;j<=9;j++){
                if((arr[i][j]==0)&&(arr[i-2][j-1]==1||arr[i-1][j-2]==1||arr[i+2][j+1]==1||arr[i+1][j-2]==1||arr[i-1][j+2]==1||arr[i+1][j+2]==1||arr[i-2][j+1]==1))
                    arr[i][j]=2;
            }
        }
	for(int i=2;i<=9;i++){
            for(int j=2;j<=9;j++){
                if((arr[i][j]==0)&&(arr[i-2][j-1]==2||arr[i-1][j-2]==2||arr[i+2][j+1]==2||arr[i+1][j-2]==2||arr[i-1][j+2]==2||arr[i+1][j+2]==2||arr[i-2][j+1]==2))
                    arr[i][j]=3;
            }
        }
	for(int i=2;i<=9;i++){
            for(int j=2;j<=9;j++){
                if((arr[i][j]==0)&&(arr[i-2][j-1]==3||arr[i-1][j-2]==3||arr[i+2][j+1]==3||arr[i+1][j-2]==3||arr[i-1][j+2]==3||arr[i+1][j+2]==3||arr[i-2][j+1]==3))
                    arr[i][j]=4;
            }
        }
        for(int i=2;i<=9;i++){
            for(int j=2;j<=9;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}