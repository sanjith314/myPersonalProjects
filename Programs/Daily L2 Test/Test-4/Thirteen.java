import java.util.Scanner;

class Thirteen{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		String s1="",s2="";

		System.out.println("Enter the no. of words in first array: ");
		int n1=in.nextInt();
		String[] arr1=new String[n1+1];
		System.out.println("Enter the first array: ");
		for(int i=0;i<n1;i++){
			arr1[i]=in.next();		
			s1=s1+arr1[i];
		}
		
		System.out.println("Enter the no. of words in second array: ");
		int n2=in.nextInt();
		String[] arr2=new String[n2+1];
		System.out.println("Enter the second array: ");
		for(int i=0;i<n2;i++){
			arr2[i]=in.next();	
			s2=s2+arr2[i];	
		}
		
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
	

}
}