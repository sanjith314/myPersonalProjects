import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Main{
		
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		boolean check=true;
		while(check){
			System.out.println("Enter 1 to book a taxi, 2 to view fare collected by taxi, 3 to exit");
			int option=in.nextInt();
			switch(option){
				case 1 -> Cab.book();
				case 2 -> Cab.taxifare();
				case 3 ->{
					check=false;
					System.exit(0);
				}
			}
		}	
	}	
}

class Cab {
	static int taxiid=1;
	public static void book(){
		Scanner in=new Scanner(System.in);

		int stops=0;
		System.out.println("Enter pick up and drop location: ");
		String pickup=in.next();
		String drop=in.next();
		int start=0,stop=0;
		
		int fare;
		if(Data.n>0){
			for(int i=0;i<Data.n;i++){
				if(Data.arrlocation[i].equals(pickup)){
					start=i+1;
					break;
				}
			}
			for(int i=0;i<Data.n;i++){
				if(Data.arrlocation[i].equals(drop)){
					stop=i+1;
					break;
				}
			}
			
			if(start-stop>0)
				stops=start-stop;
			else
				stops=stop-start;	
			if(stops==1){
				fare=200;
			}
			else
				fare=200+(stops-1)*150;
			System.out.println("Fare: "+fare);
			Data.n--;
			
			Data obj1=new Data(taxiid, drop, fare);
			Data.plist.add(obj1);
			
			Data.hm.put(taxiid,fare);
			taxiid++;
		}	
	}
	public static void taxifare(){
		System.out.println(Data.hm);	
	}
		
}

class Data{
	static int n=3;
	static String[] arrlocation={"A","B","C","D","E","F"};
	static HashMap<Integer, Integer> hm=new HashMap<>();
	static List<Data> plist= new ArrayList<>();
	int taxiid;
	String drop;
	int fare;

	public Data(int taxiid,String drop,int fare ){
		this.taxiid=taxiid;
		this.drop=drop;
		this.fare=fare;	
	}
}