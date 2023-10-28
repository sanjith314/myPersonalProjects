import java.util.Scanner;
public class Teacher extends Data {
    public static void enter(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter you username: ");
        String ts= in.nextLine();
        System.out.println("Enter you password: ");
        String tp= in.nextLine();

        if(ts.equals(tusername)&&tp.equals(tpassord)){
            System.out.println("----------------------");

            System.out.println("Enter the name,math marks, science marks, english marks");
            String name= in.nextLine();
            int math=in.nextInt();
            int science=in.nextInt();
            int english=in.nextInt();
            Marks std= new Marks(name, math, science, english);
            slist.add(std);

        }
        else {
            System.out.println("Invalid username or password ");
        }
    }
}
