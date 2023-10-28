import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s= in.nextLine();

        for(char i :s.toCharArray()){
            if ( s.indexOf(i) == s.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }

//        Boolean check=Boolean.TRUE;
//        for(int i=0;i<s.length()-1;i++){
//            for (int j=i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    check= Boolean.FALSE;
//                    break;
//                }
//            }
//            if (check){
//                System.out.println(s.charAt(i));
//                break;
//            }
//        }
    }
}
