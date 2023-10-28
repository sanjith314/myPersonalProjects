import java.util.Scanner;

public class Student extends Data{
    public static void view(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter you username: ");
        String ss= in.nextLine();
        System.out.println("Enter you password: ");
        String sp= in.nextLine();

        if(ss.equals(susername)&&sp.equals(spassord)){
            for(Marks x: slist){
                System.out.println("Name: "+x.name+"Maths: "+x.maths+"Science: "+x.science+"English: "+x.english);
                System.out.println("Average= "+(x.english+x.science+x.maths)/3);
                System.out.println("---------------------------------");
            }
        }
        else {
            System.out.println("Invalid username or password");
        }
}}