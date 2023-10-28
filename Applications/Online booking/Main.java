import java.util.Scanner;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in= new Scanner(System.in);

        boolean check= true;
        while(check){
		System.out.println("Enter 1 for Admin, 2 for User, 3 to exit");
            	int n=in.nextInt();
            	switch (n) {
                	case 1 -> Admin.enter();
                	
                	case 2 -> User.view();
     
                	case 3 ->{
                    	check=false;
                    	System.exit(0);
                	}
                	default -> System.out.println("Give a valid entry: ");
            }
        }
    }
}

class Admin{
    public static void enter(){
        Scanner in= new Scanner(System.in);
	int arrindex=0;
        System.out.println("Enter the username");
        String username=in.next();
        System.out.println("Enter the password");				
        String password=in.next();
        if(username.equals(Data.usrname)&&password.equals(Data.pswd)){
            
            boolean check= true;
            while(check) {

		System.out.println("Enter 1 to add product, 2 to view products, 3 to add a coupon, 4 to exit");
            	int n=in.nextInt();

                switch (n) {
                    case 1 -> {
                        System.out.println("Enter the product you want to add and the price of the product");
                        String prod = in.next();
                        int price = in.nextInt();
                        Data.hm.put(prod, price);
			
                    }
                    case 2 -> {
                        System.out.println(Data.hm);	
			

                    }
		    case 3 ->{
			System.out.println("Enter the coupon code: ");
			Data.arr[arrindex]=in.next();
			arrindex++;
			
		    }
			
                    case 4 -> {
                        check=false;
                    }
                    default -> {
                        System.out.println("Give a valid entry: ");
                    }	

                }
            }}else
                System.out.println("Wrong username or password");

            }
        }

        class User {
            public static void view() throws IOException {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the username");
                String username = in.next();
                System.out.println("Enter the password");
                String password = in.next();
                if (username.equals(Data.uname) && password.equals(Data.upassword)) {
			
            	
		int couponoption;
		String code;
		boolean codeyn=false;
            	boolean check= true;
            	while(check) {

		System.out.println("Enter 1 to buy product, 2 to view products, 3 to exit");
            	int n=in.nextInt();

                switch (n) {
                    case 1 -> {
                        System.out.println("Enter product name");
			String prod1=in.next();
			System.out.println("Do you have a coupon code? 1-yes 2-no ");
			couponoption=in.nextInt();
			if(couponoption==1){
				System.out.println("Enter coupon code: ");
				code=in.next();
				for(int i=0;i<Data.arr.length;i++){
					if(Data.arr[0].equals(code)){
						codeyn=true;
					}
				}
				if(codeyn){
					System.out.println("Congrats you have won a discount!");
				}
				else
					System.out.println("Oops, the code seems to be wrong!");
						
			}

			System.out.println("Congrats on the purchase! Your item will be delievered soon...");
			FileWriter f1= new FileWriter("D:Purchase/Bill.txt");
			if(codeyn)
				f1.write("Product: "+prod1+"\nPrice: "+Data.hm.get(prod1)*80/100);
			else		
				f1.write("Product: "+prod1+"\nPrice: "+Data.hm.get(prod1));
			f1.close();
			Data.hm.remove(prod1);
                        check=false;
                    }
                    case 2 -> {
                        System.out.println(Data.hm);
                        check=false;
	
                    }
                    case 3 -> {
                        check = false;
                    }
                    default -> {
                        System.out.println("Give a valid entry: ");
                    }


                }
            }

                } else
                    System.out.println("Wrong username or password");
            }

        }
        class Data{
            static String prod;
            static int price;
            static String usrname="admin1";
            static String pswd="abc123";
            static String uname="user1";
            static String upassword="hello123";
            static TreeMap<String,Integer> hm= new TreeMap();
	    static String[] arr=new String[10];
}