import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;


class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        boolean check=true;
        while(check){
            System.out.println("Enter 1 to book cab, 2 to view cab, 3 to view available cabs, 4 to exit");
            int n=in.nextInt();
            switch(n){

                case 1:
                    Cab.book();
                    break;

                case 2:
                    Cab.view();
                    break;

                case 3:
                    System.out.println(Cab.cabs+" cabs are available");
		    break;

                case 4:
                    check=false;
                    break;
                default:
                    System.out.println("Give a valid entry");
            }
        }
    }


    class Cab {

        static int cabs=5;

        static List<Passenger> plist=new ArrayList<Passenger>();

        public static void book(){
            Scanner in= new Scanner(System.in);
            if(cabs>0){
                System.out.println("Enter your name, age, destination: ");
                String name=in.next();
                int age=in.nextInt();
                String destination=in.next();

                Random r= new Random();
                int num=r.nextInt((9999 - 100) + 1) + 10;
                System.out.println(num);
                System.out.println("Enter the otp: ");
                int otp=in.nextInt();
                if(otp==num){
                    Passenger p1= new Passenger(name, age, destination);
                    plist.add(p1);
                    System.out.println("Your cab is on the way!");
                    cabs--;}
                else{
                    System.out.println("Wrong otp");}
            }
            else{
                System.out.println("All cabs are currently booked!");}


        }

        public static void view(){

            for(Passenger x: plist){
                System.out.println("Name= "+x.name+"\nAge= "+x.age+"\nDestination= "+x.destination);
                System.out.println("-----------------------------------------------------------");
            }
        }

    }

    public static class Passenger{
        static String name;
        static int age;
        static String destination;

        public Passenger(String name, int age, String destination) {
            this.name=name;
            this.age=age;
            this.destination=destination;
        }

    }
}