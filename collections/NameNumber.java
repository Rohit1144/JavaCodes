package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> ContactList = new HashMap<>();
		ContactList.put("Rohit", "81430999009");
		ContactList.put("Trash", "345609821");
		ContactList.put("Alex", "7291019301");
		
		Set<Entry<String,String>> set = ContactList.entrySet();
		Iterator<Entry<String,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String,String> m = itr.next();
			if(m.getKey().equals("Rohit")) {
				System.out.println("Rohit exists");
				break;
			}
		}
		
		set = ContactList.entrySet();
		itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> m = itr.next();
			if(m.getValue().equals("81430999009")) {
				System.out.println("81430999009 exists");
				break;
			}
		}
		
		set = ContactList.entrySet();
		itr= set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> m = itr.next();
			System.out.println(m);
		}

	}

}
