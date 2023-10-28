import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class One{
	public static void main(String[] args){
		List <String> plist=new ArrayList<>();
		HashMap<String, List<String>> hm= new HashMap<>();
		plist.add("apple");
		plist.add("banana");
		hm.put("My List", plist);
		System.out.println(hm);
	}
}