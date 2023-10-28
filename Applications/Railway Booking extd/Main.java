import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        boolean check=true;

        while(check){
	    System.out.println("1. Book a ticket");
            System.out.println("2. View booked ticket");
            System.out.println("3. Available tickets");
	    System.out.println("4. Cancel your ticket");
	    System.out.println("5. Add a cabin");
	    System.out.println("6. Add a coach");
            System.out.println("6. Exit");
            System.out.println("Enter Option: ");
            int option= in.nextInt();
            switch (option) {
                case 1:
                    Book.read();
                    break;
                case 2:
                    View.display();
                    break;
                case 3:
                    View.show();
                    break;
		case 4:
		    Book.rem();
		    break;
		case 5:
		    Book.coach();
		    break;
		case 6:
		     Book.another();	
                case 7:
                    check=false;
                    System.exit(0);
                default:
                    System.out.println("Give valid entry");
                    break;
            }
        }
    }
}

class Book {

    static List<Passenger> plist = new ArrayList<>();

    static int cabincount=1;
    static int upper = 4;
    static int middle= 4;
    static int lower= 4;
    static int id=1;	
    static int rac1=1;
    static int rac2=1;
    static int wl1=1; 
    static int wl2=1;

    public static void read() {
        Scanner in=new Scanner(System.in);
	String name;
	int age;
	int pnr;
        if(upper>0||middle>0||lower>0){
	    System.out.println("Enter your PNR and the number of tickets you want to book: ");
	    pnr=in.nextInt();
	    int count=in.nextInt();
	    String berth;
	    for(int k=1;k<=count;k++){
            	System.out.println("Enter name, age, berth preference(upper/middle/lower): ");
            	name=in.next();
            	age=in.nextInt();
            	berth=in.next();
	    	if(age<5){
			System.out.println("Minimum age to travel is 5");
			break;
	    	}
	    	else if(age>60&&berth.equals("null")&&lower>0){
			berth="lower";
	    		Passenger obj= new Passenger(pnr, id, name, age, berth);
                	plist.add(obj);
                	lower--;
			System.out.println("Your ticket has been booked!");
			id++;
	    	}
		else if(age>=5&&age<18&&berth.equals("null")&&lower>0){
			berth="lower";
	    		Passenger obj= new Passenger(pnr, id, name, age, berth);
                	plist.add(obj);
                	lower--;
			System.out.println("Your ticket has been booked!");
			id++;
		}
	    	else{
            		if ((berth.equals("lower"))&&(lower>0)){
                		Passenger obj= new Passenger(pnr, id, name, age, berth);
                		plist.add(obj);
                		lower--;
				System.out.println("Your ticket has been booked!");
            		}
            		else if((berth.equals("middle"))&&(middle>0)){
                		Passenger obj= new Passenger(pnr, id, name, age, berth);
                		plist.add(obj);
                		middle--;
				System.out.println("Your ticket has been booked!");
            		}
            		else if((berth.equals("upper"))&&(upper>0)){
                		Passenger obj= new Passenger(pnr, id, name, age, berth);
                		plist.add(obj);
                		upper--;
				System.out.println("Your ticket has been booked!");
            		}
   	    
            		else{
                		System.out.println(berth+ " berth is unavailable" );
            		}
            		id++;
            	}
	    }
	}
        else{
            System.out.println("Enter you PNR, name and age: ");
	    pnr=in.nextInt();
	    name=in.next();
	    age=in.nextInt();
	    if(rac1==1){
		Passenger obj= new Passenger(pnr, 0, name, age, "RAC1");
                plist.add(obj);
                rac1--;
		System.out.println("Your ticket has been booked in RAC1");
	    }
	    else if(rac2==1){
	    	Passenger obj= new Passenger(pnr, 0, name, age, "RAC2");
                plist.add(obj);
                rac2--;
		System.out.println("Your ticket has been booked in RAC2");
	    }
	    else if(wl1==1){
	    	Passenger obj= new Passenger(pnr, 0, name, age, "WL1");
                plist.add(obj);
                wl1--;
		System.out.println("You are in waiting list: 1");
	    }
	    else if(wl2==1){
	    	Passenger obj= new Passenger(pnr, 0, name, age, "WL2");
                plist.add(obj);
                wl2--;
		System.out.println("You are in waiting list: 2");
	    }
	    
        }

    }
    public static void rem(){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter your pnr and id: ");
	int summa=in.nextInt();
	int cancelid=in.nextInt();
	int index=0;
	int change=0;
	int idchange=0;
	String berthchange="";
	for(Passenger x: plist){
		if(x.id==cancelid){
			idchange=x.id;
			berthchange=x.berth;
			System.out.println("PNR: "+"Berth no.: "+"    Passenger name: "+"    Passenger age: "+"    Passenger berth: ");
			System.out.println(x.pnr+"        "+x.id+"            "+x.name+"            "+x.age+"            "+x.berth);
			if(x.berth.equals("middle"))
				middle++;
			else if(x.berth.equals("lower"))
				lower++;
			else
				upper++;
			plist.remove(index);
			break;
			
		}	
	}
	System.out.println("Your ticket has been cancelled!");

			for(Passenger y: plist){
				if(y.berth.equals("RAC1")){
					Passenger obj= new Passenger(y.pnr, idchange, y.name, y.age, berthchange);
                			plist.add(obj);
					plist.remove(change);
					rac1++;
				}
				change++;
			}
		
			for(Passenger y: plist){
				if(y.berth.equals("RAC2")){
					Passenger obj= new Passenger(y.pnr, 0, y.name, y.age, "RAC1");
                			plist.add(obj);
					plist.remove(change);
					rac1--;
					rac2++;
				}
				change++;
			}
		
			for(Passenger y: plist){
				if(y.berth.equals("WL1")){
					Passenger obj= new Passenger(y.pnr, 0, y.name, y.age, "RAC2");
                			plist.add(obj);
					plist.remove(change);
					rac2--;
					wl1++;
				}
				change++;
			}
		index++;
    }
    
    public static void coach(){
	cabincount++;
    	upper= upper+4;
	middle=middle+4;
	lower=lower+4;
	int change=0;
		for(Passenger y: plist){
			if(y.berth.equals("RAC1")){
				Passenger obj= new Passenger(y.pnr, 13, y.name, y.age, "lower");
                			plist.add(obj);
					plist.remove(change);	
					rac1++;
					id++;
			}
			change++;
		}
		change=0;
		for(Passenger y: plist){
			if(y.berth.equals("RAC2")){
				Passenger obj= new Passenger(y.pnr, 14, y.name, y.age, "lower");
                			plist.add(obj);
					plist.remove(change);	
					rac2++;
					id++;
			}
			change++;
		}
    }
	
    public static void another(){
	upper=upper+cabincount*4;
	middle=upper+cabincount*4;
	lower=upper+cabincount*4;
	int change=0;
		for(Passenger y: plist){
			if(y.berth.equals("RAC1")){
				Passenger obj= new Passenger(y.pnr, 13, y.name, y.age, "lower");
                			plist.add(obj);
					plist.remove(change);	
					rac1++;
					id++;
			}
			change++;
		}
		change=0;
		for(Passenger y: plist){
			if(y.berth.equals("RAC2")){
				Passenger obj= new Passenger(y.pnr, 14, y.name, y.age, "lower");
                			plist.add(obj);
					plist.remove(change);	
					rac2++;
					id++;
			}
			change++;
		}
    }
}

class Passenger {
    int pnr;
    String name;
    int age;
    String berth;
    int id;

    public Passenger(int pnr, int id, String name, int age, String berth) {
	this.pnr=pnr;
	this.id=id;
        this.name=name;
        this.age=age;
        this.berth=berth;

    }
}
class View {
    public static void display() {
	Scanner in= new Scanner(System.in);
	System.out.println("Enter you PNR: ");
	int topnr=in.nextInt();
	System.out.println("PNR: "+topnr);
	System.out.println("Berth no.: "+"    Passenger name: "+"    Passenger age: "+"    Passenger berth: ");
        for(Passenger x: Book.plist){
	    if(x.pnr==topnr)
            	System.out.println(x.id+"            "+x.name+"                "+x.age+"                    "+x.berth);
        }
    }
    public static void show() {
        int total=Book.lower+Book.upper+Book.middle;
        System.out.println("Lower berth: "+Book.lower+"\nMiddle berth: "+Book.middle+"\nUpper berth: "+Book.upper);
        System.out.println("Total berths left: "+total);
    }
}