import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		int n=in.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		System.out.println("Enter the number of rows of pieces: ");
		int row=in.nextInt();
		int[][] pieces=new int[row][];
		int col;
		for(int i=0;i<row;i++){
			System.out.println("Enter the no. of columns: ");
			col=in.nextInt();
			pieces[i]=new int[col];
			for(int j=0;j<col;j++){
				pieces[i][j]=in.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<pieces.length;j++){
				for(int k=0;k<pieces[j].length;k++){
					if(arr[i]==pieces[j][k]&&arr[i]<n-1&&k<pieces[j].length){
						if(pieces[j].length==1)
							count++;
						else{
							if(arr[i+1]==pieces[j][k+1]){
								count++;
								i++;
								k++;
							}	
						}
					
					}
				}
			}
		}
		if(count==pieces.length)
			System.out.println("True");
		else
			System.out.println("False");
			
	}	
}