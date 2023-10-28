import java.util.*;

class Yeet{
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("B");
		al.add("A");
		Collections.sort(al);
		al.forEach((Word) -> {
				System.out.println(Word);
			}
		);
	}
}