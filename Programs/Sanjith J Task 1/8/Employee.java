import java.util.Formatter;

public class Employee {
    String name;
    int year;
    String address;

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

        e1.name="Robert";
        e1.year=1994;
        e1.address="64C-WallsStreet";

        e2.name="Sam";
        e2.year=2000;
        e2.address="68D-WallsStreet";

        e3.name="Robert";
        e3.year=1999;
        e3.address="26B-WallsStreet";

        Formatter f1= new Formatter();
        f1.format("%10s%10s%20s\n","Name","Year","address");
        System.out.println(f1);

        System.out.format("%10s%10s%20s\n",e1.name,e1.year,e1.address);
        System.out.format("%10s%10s%20s\n",e2.name,e2.year,e2.address);
        System.out.format("%10s%10s%20s\n",e3.name,e3.year,e3.address);

//        f1.format(e1.name,e1.year,e1.address,"Name","Year","address");

    }
}
