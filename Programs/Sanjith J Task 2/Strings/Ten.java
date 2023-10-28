import  java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String s1= in.nextLine();
        System.out.println("Enter the 2nd string: ");
        String s2= in.nextLine();

        if(s1.length()==s2.length()){
            System.out.println(s1+s2);
        }
        else if(s1.length()>s2.length()){
            int n=s1.length()-s2.length();
            String s3=s1.substring(n);
            System.out.println(s3+s2);
        }
        else{
            int n=s2.length()-s1.length();
            String s3=s2.substring(n);
            System.out.println(s1+s3);
        }
    }
}
