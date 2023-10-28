import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Main{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
		while(true){
			System.out.println("Enter 1 for admin log in 2 for user log in 3 to exit");
			int opt=in.nextInt();
			switch(opt){
				case 1 -> Admin.home();
				case 2 -> User.start();
				case 3 -> System.exit(0);
				default -> System.out.println("Give a valid entry");
			}
		}
	}
}

class Admin {
	static int bookid=1001;
	static int userid=5001;
	public static void home(){
		Scanner in= new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter username and password: ");
		String aname=in.next();
		String apass=in.next();
		if(aname.equals(Data.adminname)&&apass.equals(Data.adminpass))
			check=true;
		else
			System.out.println("Invalid username or password");
		while(check){
			System.out.println("1. Add a new book 2. Remove an existing book 3. View list of books 4. Add a new user 5. Remove an existing user 6. View list of users 7. to exit");
			int opt=in.nextInt();
			switch(opt){
				case 1 -> addBook();
				case 2 -> rem();
				case 3 -> show();
				case 4 -> addUser();
				case 5 -> remUser();
				case 6 -> showusers();
				case 7 -> check=false;
				default -> System.out.println("Give a valid entry");
			}
		}
	}
	public static void addBook(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Title, Description, Author details, Publication date, edition, price, count");
		String title=in.next();
		String desc=in.next();
		String author=in.next();
		int date=in.nextInt();
		int edition=in.nextInt();
		double price=in.nextInt();
		int count=in.nextInt();
		Data obj=new Data(bookid, title, desc, author, date, edition, price, count);
		Data.blist.add(obj);
		bookid++;
	}
	public static void rem(){
		Scanner in= new Scanner(System.in);
		int index=0;
		System.out.println("Enter the book id :");
		int remid=in.nextInt();
		for(Data x:Data.blist){
			if(x.bookid==remid){
				Data.blist.remove(index);
				System.out.println("Book was removed");
			}
		}
	
	}
	public static void show(){
		for(Data x:Data.blist){
			System.out.println("Book ID: "+x.bookid+"\nTitle: "+x.title+"\nDescription: "+x.desc+"\nAuthor: "+x.author+"\nDate: "+x.date+"\nEdition: "+x.edition+"\nPrice: "+ x.price+ "\nCount: "+x.count);
		System.out.println("------------------------------------------");
		}
	}

	public static void addUser(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter User name / password / Age / Gender / joining date");
		String name=in.next();
		String password=in.next();
		int age=in.nextInt();
		String gender =in.next();
		int jdate=in.nextInt();
		Data obj1=new Data(userid, name, password, age, gender, jdate);
		Data.ulist.add(obj1);
		userid++;
		Data.hm.put(name,password);
	}
	public static void remUser(){
		Scanner in= new Scanner(System.in);
		int index=0;
		System.out.println("Enter the user id :");
		int remid=in.nextInt();
		for(Data x:Data.ulist){
			if(x.userid==remid){
				Data.ulist.remove(index);
				System.out.println("User was removed");
			}
		}
	}

	public static void showusers(){
		for(Data x:Data.ulist){
			System.out.println(x.userid+ x.userid+ x.name+ x.password+ x.age+ x.gender+ x.jdate);
		}
	}
}

class User{
	static boolean check=false;

	public static void start(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter username and password: ");
		String uname=in.next();
		String upass=in.next();
		Data.hm.forEach((Key, Value) -> {
			if(uname.equals(Key)&&upass.equals(Value)){
				check=true;
			}
		}
		);
		if(!check)
			System.out.println("Invalid username or password");
		while(check){
			System.out.println("Enter 1. Search for book 2. Issue book 3. Return book 4. Exit");
			int opt=in.nextInt();
			switch(opt){
				case 1 -> search();
				case 4 -> check=false;
				default -> System.out.println("Give a valid entry");
			}
		}
	}
	
	public static void search(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the name of the book: ");
		String searchname=in.next();
		for(Data x:Data.blist){
			if(x.title.equals(searchname)){
				System.out.println("Book ID: "+x.bookid+"\nTitle: "+x.title+"\nDescription: "+x.desc+"\nAuthor: "+x.author+"\nDate: "+x.date+"\nEdition: "+x.edition+"\nPrice: "+ x.price+ "\nCount: "+x.count);
			}
		}
	}
}

class Data{

	static List<Data> blist=new ArrayList<>();
	static List<Data> ulist=new ArrayList<>();
	static HashMap<String, String> hm=new HashMap<>();

	static String adminname="admin1";
	static String adminpass="abc123";

	int bookid;
	String title;
	String desc;
	String author;
	int date;
	int edition;
	double price;
	int count;

	Data(int bookid, String title, String desc, String author, int date, int edition, double price, int count){
		this.bookid=bookid;
		this.title=title;
		this.desc=desc;
		this.author=author;
		this.date=date;
		this.edition=edition;
		this.price=price;
		this.count=count;
	}

	int userid;
	String name;
	String password;
	int age;
	String gender;
	int jdate;

	Data(int userid, String name, String password, int age, String gender, int jdate){
		this.userid=userid;
		this.name=name;
		this.password=password;
		this.age=age;
		this.gender=gender;
		this.jdate=jdate;
	}
}