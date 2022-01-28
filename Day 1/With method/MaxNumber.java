package javademo;
import java.util.Scanner;

class Max {
	int biggerOne() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int temp = a>b?a:b;
		int largest = temp>c?temp:c;
		
		return largest;
	}
}

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max m = new Max();
		int temp = m.biggerOne();
		
		
		System.out.println("The largest number is: " + temp);

	}

}
