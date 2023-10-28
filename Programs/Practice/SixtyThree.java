import java.util.Scanner;
import java.util.TreeMap;

class SixtyThree{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=in.nextInt();
		TreeMap<Integer, Integer> hm=new TreeMap<>();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int rep;
		for(int i=0;i<n;i++){
			if(hm.containsKey(arr[i])){
				rep=hm.get(arr[i]);
				hm.replace(arr[i],rep+1);
			}
			else{
				hm.put(arr[i],1);
			}
		}
		System.out.println(hm);
	}
}
