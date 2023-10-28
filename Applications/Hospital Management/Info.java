import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Info {
    static List<Patients> plist= new ArrayList<Patients>();
    static void addinfo(){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the patients name");
        String name=in.next();
        System.out.println("Enter the patients age");
        int age= in.nextInt();
	System.out.println("Enter the patients disease");
        String disease= in.next();
        Patients p1= new Patients(name, age, disease);
        plist.add(p1);
    }
    static void viewinfo(){
        for(Patients x: plist){
            System.out.println("Name: "+x.name+"Age: "+x.age+"Disease: "+x.disease);
            System.out.println("-------------------------------------------------");
        }
    }

}
