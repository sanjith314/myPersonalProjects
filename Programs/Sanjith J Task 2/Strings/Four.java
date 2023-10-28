import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s= in.nextLine();
        System.out.println("Enter the word to be replaced: ");
        String s_old=in.nextLine();
        System.out.println("Enter the string to be replaced with: ");
        String s_new= in.nextLine();
        System.out.println(s.replace(s_old,s_new));
    }
}
