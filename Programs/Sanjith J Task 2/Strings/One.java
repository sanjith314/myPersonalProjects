import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the String: ");
        String s= in.nextLine();

        System.out.println("Enter the index: ");
        int n= in.nextInt();

        if(n<=s.length()){
            System.out.println("The letter is: "+ s.charAt(n));
        }
        else{
            System.out.println("Index out of range");
        }
    }
}
