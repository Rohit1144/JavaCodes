package collections;
import java.util.*;

public class EmpNamesHashSet {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("Rohit");
		set.add("hitler");
		set.add("me");
		set.add("they");
		set.add("them");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
