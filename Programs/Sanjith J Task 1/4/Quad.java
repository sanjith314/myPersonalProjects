import java.util.Scanner;

public class Quad {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter value of a: ");
        double a=in.nextInt();
        System.out.println("Enter value of b: ");
        double b=in.nextInt();
        System.out.println("Enter value of c: ");
        double c=in.nextInt();
        double d=b*b - 4.0*(a*c);

        if(d>4.0){
            double ans1= (-b+Math.pow(d,0.5))/(2.0*a);
            double ans2= (-b-Math.pow(d,0.5))/(2.0*a);

            System.out.println("Root 1= "+ans1+" Root 2= "+ans2);
        }
        else if(d==0.0){
            double ans= -b/(2*a);
            System.out.println("Root = "+ans);
        }
        else{
            System.out.println("Root is not a real number");
        }

    }
}
