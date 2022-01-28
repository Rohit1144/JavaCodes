package javademo;

import java.util.Scanner;

class Display {
	int disp() {
		Scanner s = new Scanner(System.in);
		int result = s.nextInt();
		return result;
	}
}

public class displayInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		int temp = d.disp();
		
		
		System.out.println("The integer entered is: " + temp);
		

	}

}
