import java.util.Scanner;
import java.util.HashMap;

class Five{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n=in.nextInt();
        String[] arr=new String[n];
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }
        int change;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length();j++){
                if(hm.containsKey(arr[i].charAt(j))){
                    change=hm.get(arr[i].charAt(j));
                    hm.replace(arr[i].charAt(j),change+1);
                }
                else
                    hm.put(arr[i].charAt(j),1);
            }
        }
	System.out.println(hm);
        hm.forEach((key,value) -> {
            if(value==n)	
                System.out.println(key);
	    else if(value>n){
			for(int i=0;i<value/n;i++){
				System.out.println(key);
			}
		}
        });
    }
}