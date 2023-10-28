import java.util.Scanner;
import java.util.HashMap;

class Park{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        boolean check=true;
        while(true){
            System.out.println("Enter 1 to book, 2 to view, 3 to leave and 4 to exit");
            int n=in.nextInt();
            switch(n){
                case 1 -> Parking.book();
                case 2 -> Parking.view();
                case 3 -> Parking.del();
                case 4 -> System.exit(0);
                default -> System.out.println("Enter a valid input");
            }
        }
    }
}

class Parking {

    static int a1=1;
    static int a2=1;
    static int a3=1;
    static int b1=1;
    static int b2=1;
    static int b3=1;
 
    static HashMap<String, String> hm=new HashMap();

    public static void book(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=in.next();

        if(a1==1){
            System.out.println("Your car has been parked in a1");
            a1--;
            hm.put("a1",name);
        }
        else if(a2==1){
            System.out.println("Your car has been parked in a2");
            a2--;
            hm.put("a2",name);
        }
        else if(a3==1){
            System.out.println("Your car has been parked in a3");
            a3--;
            hm.put("a3",name);
        }
        else if(b1==1){
            System.out.println("Your car has been parked in b1");
            b1--;
            hm.put("b1",name);
        }
        else if(b2==1){
            System.out.println("Your car has been parked in b2");
            b2--;
            hm.put("b2",name);
        }
        else if(b3==1){
            System.out.println("Your car has been parked in b3");
            b3--;
            hm.put("b3",name);
        }
        else
            System.out.println("No slots available");

    }

    public static void view(){

        hm.forEach((Key,Value) -> {
		System.out.println("Name: "+Value);
		System.out.println("Slot: "+Key);
		System.out.println("------------------");
	}	
	);
    }

    public static void del() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Lot number: ");
        String s=in.next();
        hm.remove(s);
        switch (s) {
            case "a1" -> a1++;
            case "a2" -> a2++;
            case "a3" -> a3++;
            case "b1" -> b1++;
            case "b2" -> b2++;
            case "b3" -> b3++;
            default -> System.out.println("Give a valid lot");
        }

        System.out.println("Thank you for visiting, please visit again!");
    }
}