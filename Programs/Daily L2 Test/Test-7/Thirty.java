import java.util.Scanner;

class Thirty{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of words");
        int n=in.nextInt();
        String[] arr= new String[n];
        System.out.println("Enter the words");
        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }
	int count;
        String str;
	int m;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                str="";
		count=0;
		m=0;
                if(i!=j){
                    for(int k=0;k<arr[j].length();k++){
			
			if(arr[i].charAt(k)==arr[j].charAt[m])
				count++;
			m++;
		     }
                    if(count==arr[j].length())
                        System.out.print(arr[i]+" "+arr[j]);
                }
            }
            System.out.println("");
        }
    }
}