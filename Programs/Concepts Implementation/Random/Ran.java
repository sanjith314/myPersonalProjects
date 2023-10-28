import java.util.Random;

class Ran{
	public static void main(String[] args){
		Random r=new Random();
		int x=r.nextInt(6)+1;
		int num=r.nextInt((9999 - 100) + 1) + 10;
		System.out.println(x);
		System.out.println(num);
	}
}