import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1=in.nextLine();
        System.out.println("Enter the second string: ");
        String s2=in.nextLine();
        int i=0;
        boolean check= true;
        if(s1.length()!=s2.length()){
            System.out.println("They are not rotations");
        }
        else {
                for(int j= s1.length()-1;j>0;j--){
                    if(s1.charAt(i)!=s2.charAt(j)){
                        check=false;
                        break;
                    }
                    i++;
                }
        }
        if(check){
            System.out.println("They are rotations");
        }
        else {
            System.out.println("They are not rotations");
        }
    }
}
