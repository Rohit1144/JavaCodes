package javademo;
import java.util.Scanner;

class EvenOdd {
	void identify() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2==0) {
			System.out.println("The entered number is even");
		}
		else {
			System.out.println("The entered number is odd");
		}
	}
}

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd e = new EvenOdd();
		e.identify();
		

	}

}
