import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileWriter;

class Main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while (true){
            System.out.println("Enter 1 for agent log in, 2 for user log in, 3 to exit");
            int option=in.nextInt();
            switch(option){
                case 1 -> Agent.start();
                case 2 -> User.page();
                case 3-> System.exit(0);
            }
        }
    }
}

class Agent{
    public static void start(){
        Scanner in= new Scanner(System.in);
        boolean check= true;
        System.out.println("Enter you Email ID and Password");
        String adminname=in.next();
        String adminpassword=in.next();
        if(adminname.equals(Data.aname)&&adminpassword.equals(Data.apassword)){
            System.out.println("Welcome "+adminname+"!");
            while (check){
                System.out.println("Enter 1 to view users , 2 to view pending requests, 3 to exit");
                int option=in.nextInt();
                switch(option){
                    case 1 -> Account.view();
                    case 2 -> Account.pending();
                    case 3-> check=false;
                }
            }
        }
        else
            System.out.println("Username or Password in wrong!");
    }
}

class User{

    public static void page() {
        Scanner in = new Scanner(System.in);
        boolean check=true;
        while (check){
            System.out.println("Enter 1 to create account, 2 to login, 3 to exit");
            int option=in.nextInt();
            switch(option){
                case 1 -> Account.create();
                case 2 -> userLogin();
                case 3-> check=false;
            }
        }
    }
    static int i=0;
    public static void userLogin() {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter email and Password");
        String email=in.next();
        String password=in.next();

        Account.hm.forEach((Key, Value) -> {
                    if(email.equals(Key)&&password.equals(Value)){
                        System.out.println("Welcome!");	
                        i++;
                        try {
                            Account.transfer();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );

        if(i==0)
            System.out.println("This user does not exist! Try creating a new account");

    }
}

class Account {

    static List<Data> userlist = new ArrayList<>();
    static HashMap<String, String> hm=new HashMap<>();
    static int hid=101;
    
    public static void create(){

        Scanner in= new Scanner(System.in);
        System.out.println("Enter name, email id, phone number, password, Initial RC Deposit");
        String name=in.next();
        String email=in.next();
        int phoneno=in.nextInt();
        String password=in.next();
        double rc=in.nextDouble();
        boolean approval=false;
        if(isValid(password)){
            hm.put(email,password);
            Data d1=new Data(name, email, phoneno, hid, password, rc, approval);
            userlist.add(d1);
            hid++;
        }
        else
            System.out.println("Your password did not meet your criteria");
    }

    public static boolean isValid(String password){
        if(password == null)
            return false;
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
        Pattern p= Pattern.compile(regex);
        Matcher m=p.matcher(password);
        return m.matches();
    }

    public static void view() {
        String status;
        for (Data x : userlist) {
            if (x.approval)
                status = "Approved";
            else
                status = "Waiting for approval";
            System.out.println("Name: " + x.name + " \nEmail ID: " + x.email + " \nPhone Number: " + x.phoneno + " \nHID: " + x.hid + " \nRC Balance: " + x.rc + "\nStatus: " + status);
            System.out.println("---------------------------");
        }
    }

    public static void pending () {
        Scanner in = new Scanner(System.in);
        for (Data x : userlist) {
            if (!x.approval) {
                System.out.println("Name: " + x.name + " \nEmail ID: " + x.email + " \nPhone Number: " + x.phoneno + " \nHID: " + x.hid + " \nRC Balance " + x.rc + "\nStatus " + "Waiting for approval");
                System.out.println("---------------------------");
            }
        }
        System.out.println("Enter hid to approve or 0 to exit");
        int opt = in.nextInt();
        if (opt == 0) {
        } else {
            for (Data x : userlist) {
                if (x.hid == opt)
                    x.approval = true;
            }
        }
    }

    public static void transfer() throws IOException{
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your hid");
        int from=in.nextInt();
        System.out.println("Enter hid to send money");
        int to=in.nextInt();
        System.out.println("Enter amount to send");
        int amt=in.nextInt();
        for(Data x: userlist){
            if(x.approval) {
                if (from == x.hid) {
                    x.rc = x.rc - amt - (float)(amt * 15 / 100);
                    FileWriter f1= new FileWriter("D:/ZcoinTransaction/Transaction.txt");
                    f1.write(x.name+" sent "+amt+" to HID: "+to);
                    f1.close();
                } else if (to == x.hid) {
                    x.rc = x.rc + amt;
                }
            }
            else
                System.out.println("Your account has not been approved yet");
        }
    }

}

class Data{

    static String aname="admin1";
    static String apassword="abc123";

    int hid;
    String name;
    String email;
    int phoneno;
    String password;
    double rc;
    boolean approval;

    public Data(String name, String email, int phoneno, int hid, String password, double rc, boolean approval){
        this.name=name;
        this.email=email;
        this.phoneno=phoneno;
        this.hid=hid;
        this.password=password;
        this.rc=rc;
        this.approval=approval;
    }
}