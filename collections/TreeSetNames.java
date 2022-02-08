package collections;
import java.util.*;

public class TreeSetNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Rohit");
		set.add("me");
		set.add("them");
		set.add("they");
		set.add("nope");
		
		String name = "they";
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals(name)) {
				System.out.println(name + "exits");
				break;
			}
			
			
		}
		

	}

}
