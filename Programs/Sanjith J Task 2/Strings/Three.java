import java.util.Locale;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1= in.nextLine();
        System.out.println("Enter second string: ");
        String s2= in.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("The are in lexicographical order");
        }
        else {
            System.out.println("They are not in lexicographical order");
        }
    }
}
