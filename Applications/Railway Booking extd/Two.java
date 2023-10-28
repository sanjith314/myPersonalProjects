import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int lcount=0;
		int rcount=0;
		boolean check=false;
		for(int i=1;i<n-1;i++){
			lcount=0;
			rcount=0;
			for(int j=0;j<i;j++){
				lcount++;
			}
			for(int j=i+1;j<n;j++){
				rcount++;
			}
			if(lcount==rcount){
				System.out.println(i+1);
				check=true;
				break;
			}
		}
		if(!check)
			System.out.println("0");
	}
}