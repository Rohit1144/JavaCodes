package java8streams;

import java.util.stream.Stream;

public class StreamOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of(new String[] {"rohit","hitler","potato","rip","damn"});
		stream.forEach(res->System.out.println(res));

	}

}
