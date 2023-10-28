import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the String");
        String s=in.nextLine();
        int n=s.length();
        String s1;
        if(s.length()<2){
            System.out.println("Give a string with more than 1 letter");
        }
        else{
            s1=s.substring(0,n-2);
            s1=s1+s.charAt(n-1);
            s1=s1+s.charAt(n-2);
            System.out.println(s1);
        }
    }
}
