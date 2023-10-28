import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Main{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("WELCOME TO FACEBOOK!");
		while(true){
			System.out.println("1. Create account \n2. Login \n3. Exit \n4. View all accounts \n5. View all posts");
			int opt=in.nextInt();
			switch(opt){
				case 1 -> User.create();
				case 2 -> User.login();
				case 3 -> System.exit(0);
				case 4 -> User.viewUsers();
				case 5 -> User.viewPosts();
			}
		}
	}
}

class User{

	static HashMap<Integer, List<String>> posts= new HashMap<>();
	static HashMap<Integer, Integer> friendsHM= new HashMap<>();
	static List<Data> ulist=new ArrayList<>();
	static int userId=101;

	public static void create(){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter your Username, Password");
		String username=in.next();
		String userpassword=in.next();
		Data obj= new Data(userId, username, userpassword);
		System.out.println("Your unique id is: "+userId);
		ulist.add(obj);
		userId++;
	}	
	public static void login(){
		Scanner in= new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter user ID and password");
		int inputId=in.nextInt();
		String inputpass=in.next();
		for(Data x:ulist){
			if(x.userId==inputId&&x.userpassword.equals(inputpass)){
				check=true;
				break;
			}
		}
		if(!check)
			System.out.println("Invalid username or password");
		while(check){
			System.out.println("Enter 1. Post 2. Check feed 3. Add friend 4. Exit");
			int option=in.nextInt();
			switch(option){
				case 1 -> Activity.post(inputId);
				case 2 -> Activity.display(inputId);
				case 3 -> Activity.follow(inputId);
				case 4 -> check=false;
			}
		}
	}
	public static void viewUsers(){
		for(Data x:ulist){
			System.out.println("User ID: "+x.userId+"\nUser Name: "+ x.username+"\nPassword: "+x.userpassword);
			System.out.println("----------------------");
		}
	}
	public static void viewPosts(){
		for(Data x: Activity.postList){
			System.out.println(x.userPost+"-"+x.inputId);
		}
	}
}	

class Activity{
	
	static List<Data> postList=new ArrayList<>();
	
	public static void post(int inputId){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter your post: ");
		String userPost=in.nextLine();
		Data obj1=new Data (inputId, userPost);
		postList.add(obj1);
	}
	
	static int val=0;
	
	public static void display(int inputId){
		User.friendsHM.forEach((Key, Value) -> {
			if(Key==inputId)
				val=Value;
		}
		);

		for(Data x: postList){
			if(x.inputId==val)
				System.out.println(x.userPost);
		}
	}
	public static void follow(int inputId){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter ID to search: ");
		int searchId=in.nextInt();
		boolean searchCheck=false;
		for(Data x: User.ulist){
			if(searchId==x.userId){
				searchCheck=true;
				break;
			}
		}
		if(!searchCheck)
			System.out.println("User not found!");
		else{
			User.friendsHM.put(inputId, searchId);
		}
	}
}

class Data{

	int userId;
	String username;
	String userpassword;
	Data(int userId, String username, String userpassword){
		this.userId=userId;
		this.username=username;
		this.userpassword=userpassword;
	}

	int inputId;
	String userPost;
	Data(int inputId, String userPost){
		this.inputId=inputId;
		this.userPost=userPost;
	}
}