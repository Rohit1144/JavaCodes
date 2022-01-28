package javademo;
import java.util.Scanner;

class Addition {
	int add() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int total = a + b;
		return total;
	}
}


public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Addition a = new Addition();
		temp = a.add();
		System.out.println("The total is: " + temp);
		
		
		
		

	}

}
