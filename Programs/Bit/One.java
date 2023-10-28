import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);	
		System.out.println("Enter the 2 numbers: ");
		int n1=in.nextInt();
		int n2=in.nextInt();
		int sum=0;
		int num;
		for(int i=31;i>=0;i--){
			num= 1<<i;
			if((num&n1)>0){
				if((num&n2)>0){
					sum=sum+num;
				}
				else
					break;
			}
		}
		System.out.println(sum);
	}
}