import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n=in.nextInt();
		char[] arr=new char[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.next().charAt(0);
		}
		char temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((int)arr[i]-'a'<(int)arr[j]-'a'){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
		}
	}
}