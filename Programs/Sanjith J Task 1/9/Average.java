import java.util.Scanner;

public class Average {
    double n1;
    double n2;
    double n3;

    static double calculate(double n1,double n2,double n3){
        return (n1+n2+n3)/3;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double num1=in.nextInt();
        System.out.println("Enter 2st number: ");
        double num2=in.nextInt();
        System.out.println("Enter 3st number: ");
        double num3=in.nextInt();

        System.out.println(calculate(num1, num2, num3));
    }
}
