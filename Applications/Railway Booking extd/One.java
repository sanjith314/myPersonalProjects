import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=in.next();
		char[] arr=s.toCharArray();
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					arr[i]='0';
					break;
				}
			}
		}
		int greatest=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!='0'){
				count++;
			}
			else{
				if(count>greatest){
					greatest=count;
					count=0;
				}
			}
		}
		System.out.println(greatest);
	}
}