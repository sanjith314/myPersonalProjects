import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=in.nextInt();
        System.out.println("Enter second number: ");
        int n2=in.nextInt();

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("a= "+n1+" b= "+n2);

    }
}
