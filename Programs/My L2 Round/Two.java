import java.util.Scanner;

class Two{

	public static int containsA(int[] arr, int i, int sum, String a){
		String str=String.valueOf(arr[i]);
		if(a.length()==1){
			for(int j=0;j<str.length();j++){
				if(str.charAt(j)==a.charAt(0)){
					sum+=i;
					break;
				}
			}
		}
		else{
			for(int j=0;j<str.length()-1;j++){
				if(str.charAt(j)==a.charAt(0)&&str.charAt(j+1)==a.charAt(1)){
					sum+=i;
					j++;
					break;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter A: ");
		String a=in.next();
		System.out.println("Enter the size of the array: ");
		int n=in.nextInt();
		int sum=0;
		int[] arr=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
			sum = containsA(arr, i, sum, a);
		}
		System.out.println(sum);
	}
}