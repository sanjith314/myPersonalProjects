import java.util.Scanner;

public class Floating_Point {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        float n=in.nextFloat();

        if(n==0.0){
            System.out.println("zero");
        }
        else if(n>0.0&&n<1.0){
            System.out.println("positive small");
        }
        else if(n>=1.0&&n<1000000.0){
            System.out.println("positive");
        }
        else if(n>1000000.0){
            System.out.println("positive large");
        }
        else if(n>=-1.0&&n<0.0){
            System.out.println("negative small");
        }
        else if(n<=-1.0&&n<-1000000.0){
            System.out.println("negative");
        }
        else{
            System.out.println("negative large");
        }
    }
}
