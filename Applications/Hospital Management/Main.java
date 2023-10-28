import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        boolean check=true;
        while(check){
            System.out.println("Enter 1 to add data, 2 to view data, 3 to exit");
            int option= in.nextInt();
            switch(option){
                case 1:
                    Info.addinfo();
                    break;
                case 2:
                    Info.viewinfo();
                    break;
                case 3:
                    check=false;
                    break;
            }
        }
        System.out.println("Thank you for using");
    }
}
