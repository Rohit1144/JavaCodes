package javademo;
import java.util.Scanner;

class QR {
	void qr() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int quotient = a/b;
		int remainder = a%b;
		
		System.out.println("The quotient is: " + quotient);
		System.out.println("The remainder is: " + remainder);
	}
}

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QR q = new QR();
		q.qr();
		
		
		

	}

}
