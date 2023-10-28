import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Main{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		boolean check=true;
		while(check){
			System.out.println("Enter 1 to create id, 2 to exit");
			int option=in.nextInt();
			switch(option){
				case 1 -> Patients.book();
				case 2 -> {
					check=false;
					System.exit(0);
				}
			}
		}
	
	}
}

class Patients{
	public static void book(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of entries: ");
		int n=in.nextInt();

		int[] arrid=new int[n];
		String[] arrname=new String[n];
		int[] arrtimetaken=new int[n];
		int[] arrouttime=new int[n];
		int[] arrwaitingtime=new int[n];

		int id;
		String name;
		int time;
		int doc;
		int outtime;
		int docfree;
		int waitingtime;
		int doctime;
		for (int i=0;i<n;i++){
			outtime=0;
			System.out.println("Enter id, name, time");
			id=in.nextInt();
			name=in.next();
			time=in.nextInt();
			Data p1= new Data(id, name, time);
			Data.plist.add(p1);	
			
			Random r= new Random();
			doctime=r.nextInt((19-1)+2);
	
			//System.out.println("Enter time taken by doctor: ");
			//doctime=in.nextInt();

			docfree=time+doctime;
			outtime=time+25;
			if(i==0)
				waitingtime=0;
			else
				waitingtime=-(docfree-(time+10));
			
			arrid[i]=id;
			arrname[i]=name;
			arrtimetaken[i]=doctime;
			arrouttime[i]=outtime;
			arrwaitingtime[i]=waitingtime;
		}
		for(int i=0;i<n;i++){
			System.out.println("Patient ID: "+arrid[i]);
			System.out.println("Name: "+arrname[i]);
			System.out.println("Time taken by doctor: "+arrtimetaken[i]);
			System.out.println("Outtime: "+arrouttime[i]);
			System.out.println("Waiting time: "+arrwaitingtime[i]);
			System.out.println("----------------------------------------");
		}
	}
	
}

class Data{

	static List<Data> plist=new ArrayList<>();
	int id;
	String name;
	int time;
	public Data(int id, String name, int time){
		this.id=id;
		this.name=name;
		this.time=time;
	}
}