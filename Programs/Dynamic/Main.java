import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		String[][] arr= new String[7][7];
		arr={["w","w","w","w","w",'w","w"],
		     ["w"," "," "," "," "," ","w"],
		     ["w"," ","1","1","1"," ","w"],
		     ["w"," ","1","1","1"," ","w"],
		     ["w"," "," "," "," "," ","w"],
		     ["w"," "," "," "," "," ","w"],
		     ["w","g","g","o","g","g","w"]};
		 for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				System.out.println(arr[i][j]);
			}
		}
				
	}
}