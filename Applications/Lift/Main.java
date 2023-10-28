import java.util.Scanner;	
import java.util.HashMap;

class Main{
	
	static HashMap<String, Integer> hm=new HashMap<>();
	
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		hm.put("l1",0);
		hm.put("l2",0);
		hm.put("l3",6);
		hm.put("l4",6);
		hm.put("l5",0);
		
		boolean check=true;
		while (check){
			System.out.println(hm);
			System.out.println("Enter 1 to use lift, 2 to enter maintainance, 3 to exit");
			int option =in.nextInt();
			switch(option){
				case 1-> Lift.use();
				case 2-> Lift.maintain();
				case 3-> System.exit(0);
				default-> System.out.println("Enter a valid option ");
			}
		}
	}
}
	class Lift extends Main{
		public static void maintain(){
			Scanner in= new Scanner(System.in);
			System.out.println("1 to add maintainance, 2 to remove from maintainance");
			int op=in.nextInt();
			String lift;
			if(op==1){
				System.out.println("Enter the lift id: ");
				lift=in.next();
				hm.replace(lift,-1);
			}
			else if(op==2){
				System.out.println("Enter the lift id: ");
				lift=in.next();
				if(lift.equals("l1")||lift.equals("l2")||lift.equals("l5"))	
					hm.replace(lift,0);
				else
					hm.replace(lift,6);
			}
			else
				System.out.println("Enter a valid option");

		}
		public static void use(){
			Scanner in= new Scanner(System.in);
			int l1l2smallest;
			System.out.println("Enter your current floor/ floor to reach ");
			int current=in.nextInt();
			int toReach=in.nextInt();
			if(hm.get("l1")==0&&hm.get("l2")==0&&hm.get("l3")==6&&hm.get("l4")==6&&hm.get("l5")==0){
				if(toReach>=1&&toReach<=5&&current>=1&&current<=5)
					hm.replace("l1",toReach);
				else if((current<=5&&toReach>5)||(current>5&&toReach<=5)){
					hm.replace("l5",toReach);
				}
				else 
					hm.replace("l3",toReach);
			}
			else{
					
				if(toReach>=0&&toReach<=5&&current>=0&&current<=5){
					if(Math.abs(hm.get("l1")-current)<=Math.abs(hm.get("l2")-current)){
						if(hm.get("l1")!=-1)
							hm.replace("l1",toReach);
						else
							hm.replace("l2",toReach);
					}
					else if(Math.abs(hm.get("l1")-current)>Math.abs(hm.get("l2")-current)){
						if(hm.get("l2")!=-1)
							hm.replace("l2",toReach);
						else
							hm.replace("l1",toReach);
					}
				}
				else if((current>5&&toReach>5)){
					if(Math.abs(hm.get("l3")-current)<=Math.abs(hm.get("l4")-current)){
						if(hm.get("l3")!=-1)
							hm.replace("l3",toReach);
						else
							hm.replace("l4",toReach);
					}
					else if(Math.abs(hm.get("l3")-current)>Math.abs(hm.get("l4")-current)){
						if(hm.get("l4")!=-1)
							hm.replace("l4",toReach);
						else
							hm.replace("l3",toReach);
					}
				}
				else
					hm.replace("l5",toReach);
				}
			}
	}