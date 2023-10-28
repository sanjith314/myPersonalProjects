import java.util.Scanner;
import java.util.Arrays;

class Three{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1=in.next();
		System.out.println("Enter string 2: ");
		String s2=in.next();
		int n=0;
		int[] arr=new int[s2.length()];
		for(int i=0;i<s2.length();i++){
			for(int j=0;j<s1.length();j++){
				if(s2.charAt(i)==s1.charAt(j)){
					arr[n]=j;
					n++;
					break;
				}
			}
		}
		Arrays.sort(arr);
		for(int i=arr[0];i<=arr[arr.length-1];i++){
			System.out.print(s1.charAt(i));
		}
	}
}