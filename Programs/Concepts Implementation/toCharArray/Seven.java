import java.util.Scanner;
import java.util.Arrays;

class Seven{
	
	public static 	void anagram(String s1, String s2){
		char[] arrs1=s1.toCharArray();
		char[] arrs2=s2.toCharArray();
		Arrays.sort(arrs1);
		Arrays.sort(arrs2);
		if(Arrays.equals(arrs1,arrs2))
			System.out.print(s1+" "+s2);
	}
	
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no. of words: ");
		int n=in.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=in.next();
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
					anagram(arr[i],arr[j]);
				}
			}
			System.out.print(" ");
		}
		
	}	
