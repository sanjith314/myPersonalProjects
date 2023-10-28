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
            System.out.println("5. Exit");
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
                    Available.show();
                    break;
		case 4:
		    Book.rem();
		    break;	
                case 5:
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

    static int upper = 5;
    static int middle= 5;
    static int lower= 5;
    static int id=1;	

    public static void read() {
        Scanner in=new Scanner(System.in);
        if(upper>0||middle>0||lower>0){
            System.out.println("Enter name, age, berth preference(upper/middle/lower): ");
            String name=in.nextLine();
            int age=in.nextInt();
            String berth=in.next();
            if ((berth.equals("lower"))&&(lower>0)){
                Passenger obj= new Passenger(id, name, age, berth);
                plist.add(obj);
                lower--;
		System.out.println("Your ticket has been booked!");
            }
            else if((berth.equals("middle"))&&(middle>0)){
                Passenger obj= new Passenger(id, name, age, berth);
                plist.add(obj);
                middle--;
		System.out.println("Your ticket has been booked!");
            }
            else if((berth.equals("upper"))&&(upper>0)){
                Passenger obj= new Passenger(id, name, age, berth);
                plist.add(obj);
                upper--;
		System.out.println("Your ticket has been booked!");
            }
   	    
            else{
                System.out.println(berth+ " berth is unavailable" );
            }
            id++;
        }
        else{
            System.out.println("All tickets are booked");
        }

    }
    public static void rem(){
	Scanner in= new Scanner(System.in);
	System.out.println("Enter your id: ");
	int cancelid=in.nextInt();
	int index=0;
	for(Passenger x: plist){
		if(x.id==cancelid){
			if(x.berth.equals("middle"))
				middle++;
			else if(x.berth.equals("lower"))
				lower++;
			else
				upper++;
			plist.remove(index);
			break;
		}	
		index++;
	}
	System.out.println("Your ticket has been cancelled!");
	
    }
}

class Passenger {
    String name;
    int age;
    String berth;
    int id;

    public Passenger(int id, String name, int age, String berth) {
	this.id=id;
        this.name=name;
        this.age=age;
        this.berth=berth;

    }
}
class View {
    public static void display() {
        for(Passenger x: Book.plist){
            System.out.println("Passenger ID: "+x.id+"\nPassenger name: "+x.name+"\nPassenger age: "+x.age+"\nPassenger berth: "+x.berth);
            System.out.println("---------------------------------");
        }
    }
	
    
}
class Available {
    public static void show() {
        int total=Book.lower+Book.upper+Book.middle;
        System.out.println("Lower berth: "+Book.lower+"\nMiddle berth: "+Book.middle+"\nUpper berth: "+Book.upper);
        System.out.println("Total berths left: "+total);
    }
}