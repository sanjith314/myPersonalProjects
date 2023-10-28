import java.util.Scanner;

class Frog{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter x, y, s, t");
		int x=in.nextInt();
		int y=in.nextInt();
		int s=in.nextInt();
		int t=in.nextInt();
		int count=0;
		for(int i=x;i<x+s;i++){
			for(int j=y;j<y+s;j++){
				if((i+j)<=t)
					count++;
			}
		}
		System.out.println(count);
		
	}
}