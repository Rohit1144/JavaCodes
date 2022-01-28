package javademo;
import java.util.Scanner;

class Swap {
	void exchange() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: " + a + " " + b);
		
	}
}


public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s = new Swap();
		s.exchange();
		
		
		

	}

}
