import java.util.Scanner;

class Three{
	public static void isRev(int a, int b){
		String str1=String.valueOf(a);
		String str2=String.valueOf(b);
		String str3="";
		for(int i=str2.length()-1;i>=0;i--){
			str3=str3+str2.charAt(i);
		}
		if(str1.equals(str3))
			System.out.println(str1+" "+str2);
	}

	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter N: ");
		int n=in.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Enter 1st array: ");
		for(int i=0;i<n;i++){
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter 2nd array: ");
		for(int i=0;i<n;i++){
			arr2[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				isRev(arr1[i], arr2[j]);
			}
		}
	}
}