import java.util.Scanner;

class Eight{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=in.nextInt();
		int count;
		for(int i=2;i<=n;i++){
			count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
					count++;
			}
			if(count<=2)
				System.out.println(i);
		}
	}

}