import java.util.Scanner;

class Two{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=in.next();
		boolean[] arr=new boolean[4];
		if(s.length()>=8)
			arr[0]=true;
		for(int i=0;i<s.length();i++){
			if((int)s.charAt(i)==64||(int)s.charAt(i)==33||(int)s.charAt(i)==35||(int)s.charAt(i)==37||(int)s.charAt(i)==38)
				arr[1]=true;
			else if((int)s.charAt(i)<=57&&(int)s.charAt(i)>=48)
				arr[2]=true;
			else if((int)s.charAt(i)<=90&&(int)s.charAt(i)>=65)
				arr[3]=true;
		}
		int count=0;
		for(int i=0;i<4;i++){
			if(arr[i]==true)
				count++;
		}
		switch(count){
			case 0-> System.out.println("Bad");
			case 1-> System.out.println("Weak");
			case 2-> System.out.println("Medium");
			case 3-> System.out.println("Good");
			case 4-> System.out.println("Strong");
		}
	}
}