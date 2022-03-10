import java.util.*;


public class LongestWordInArray {
	
	
	/**
	 * @param sen
	 * @return
	 */
	public static String LongestWord(String sen) {
		
		String newSen = sen.replaceAll("[^a-zA-Z0-9]"," ");
		return Arrays.stream(newSen.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null).toString();
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String result = LongestWordInArray.LongestWord(s.nextLine());
		
		System.out.println(result);
		
		s.close();


	}

}
