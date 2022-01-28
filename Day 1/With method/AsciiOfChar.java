package javademo;
import java.util.Scanner;

class Ascii {
	int asciiValue() {
		Scanner s = new Scanner(System.in);
		char letter = s.next().charAt(0);
		int ascii = letter;
		return ascii;
	}
}



public class AsciiOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascii a = new Ascii();
		int temp;
		temp = a.asciiValue();
		System.out.println("The ASCII value is: " + temp );

	}

}
