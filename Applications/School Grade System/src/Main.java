import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        boolean check= true;
        while(check){
            System.out.println("Enter 1 for Teacher, 2 for student, 3 to exit");
            int n=in.nextInt();
            switch (n) {
                case 1 -> {
                    Teacher.enter();
                }
                case 2 -> {
                    Student.view();
                }
                case 3 ->{
                    check=false;
                    System.exit(0);
                }
                default -> {
                    System.out.println("Give a valid entry: ");
                }

            }
        }
    }
}
