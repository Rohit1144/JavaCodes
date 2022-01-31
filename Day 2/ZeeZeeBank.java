package javademo;
import java.util.Scanner;

public class ZeeZeeBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		s.nextLong();
		System.out.println("Enter initial balance: ");
		double balance = s.nextDouble();
		System.out.println("Enter the amount to be deposited: ");
		double deposit = s.nextDouble();
		double availBalance = balance + deposit;
		System.out.println("Available balance is: " + availBalance);
		System.out.println("Enter the amount to be withdrawn: ");
		double amountWithdrawn = s.nextDouble();
		if(amountWithdrawn > availBalance) {
			System.out.println("Insufficient balance");
		}
		else {
			double Final = availBalance - amountWithdrawn;
			System.out.println("Available balance is: " + Final);
		}
		
		

	}

}