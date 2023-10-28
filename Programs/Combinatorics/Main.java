import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		boolean check=true;
		while true(){
			System.out.println("Enter 1 to create account, 2 to exit");
			int option=in.nextInt();
			switch(option){
				case 1 -> Account.create();
				case 2-> System.exit(0);
			}
		}
	}
}

class Account extends Data{
	public static void create(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter name, email id, phone number, password, Initial RC Deposit");
		String name=in.next();
		String email=in.next();
		int phoneno=in.nextInt();
		String password=in.next();
		double rc=in.nextDouble();
		Data d1=new Data(name, email, phoneno,hid, password, rc);
		userlist=add(d1);
	}
}

class Data{
	static List userlist<Data> = new ArrayList<>();
	static int hid=101;
	Data(String name, String email, int phoneno, int hid, String password, double rc){
		this.name=name;
		this.email=email;
		this.phoneno=phoneno;
		this.hid=hid;
		this.password=password;
		this.password=password;
	}
}