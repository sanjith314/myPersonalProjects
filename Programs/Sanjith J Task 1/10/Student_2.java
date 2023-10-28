public class Student_2 {

    String name;
    int roll_no;
    int phone_number;
    String address;

    public static void main(String[] args) {

        Student_2 s1= new Student_2();
        s1.name="Sam";
        s1.roll_no=2;
        s1.phone_number=1231982;
        s1.address= "Chennai";

        Student_2 s2= new Student_2();
        s2.name="Sam";
        s2.roll_no=2;
        s2.phone_number=4329432;
        s2.address= "Chennai";

        System.out.println("Name="+s1.name+" Roll no="+s1.roll_no+" Phone number="+s1.phone_number+" Address="+s1.address);
        System.out.println("Name="+s2.name+" Roll no="+s2.roll_no+" Phone number="+s2.phone_number+" Address="+s2.address);
    }
}