import java.util.Scanner;
import java.util.Arrays;

class Seventeen{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		String s1=in.nextLine();
		System.out.println("Enter the 2nd number: ");
		String s2=in.nextLine();
		int[] arr=new int[s1.length()+1];																
		
		String s3="";
		for(int i=s1.length();i>=0;i--){
			for(int j=s2.length();j>=0;j--){
				for(int k=s1.length()+1;k>=0;k--){
					if((int)s1.charAt(i)+(int)s2.charAt(j)+arr[k]==3){
						s3=s3+"1";
						arr[k-1]=1;
					}
					else if((int)s1.charAt(i)+(int)s2.charAt(j)+arr[k]==2){
						s3=s3+"0";
						arr[k-1]=1;
					}
					else if((int)s1.charAt(i)+(int)s2.charAt(j)+arr[k]==1){
						s3=s3+"1";
						arr[k-1]=0;
					}
					else
						s3=s3+"0";
				}			
			}
		}
		for(int i=s3.length();i>=0;i--){
			System.out.print(s3.charAt(i));
		}
}
}