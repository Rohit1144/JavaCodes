package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map = new HashMap<>();
		map.put("That", "This");
		map.put("There", "Then");
		map.put("Their", "Them");
		
		Set<Entry<String,String>> set = map.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> m = itr.next();
			System.out.println(m);
		}
		

	}

}
