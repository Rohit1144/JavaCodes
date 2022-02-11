package java8streams;

import java.util.ArrayList;
import java.util.List;

public class CountOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Rohit");
		list.add("Oppoppi");
		list.add("YEEHAWWWW?");
		list.add("Hello");
		list.add("Hi");
		list.add("Right");
		list.add("Hilarious");
		list.add("Dull");
		
		Long result = list.stream().filter(res->res.endsWith("i")).count();
		System.out.println(result);

	}
}
