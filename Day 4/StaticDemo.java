package day4;

class Area {
	
	static {

		System.out.println("__________ from static block");

	}
	
	static {

		System.out.println("__________ from static block   2");

	}
	// non static variable
	int lenght = 10;/// global variable

	static int length1 = 7;/// global variable

	/// what type of variable ? class variable which static in nature
	// non static method
	void showArea(int side) {

		int breadth = 20;// local variable

		int temp = side * breadth;

		System.out.println(temp);

	}

	/// static method
	static void showArea1(int side) {

		int breadth = 20;// local varible

		int temp = side * breadth;

		System.out.println(temp);

	}



}

public class StaticDemo {
	// this static
	public static void main(String ar[]) {
		// this class variable which is static in nature
		Area side = null;

		side.showArea1(7); // this method is called without creating an object
		// non static method
		Area a1 = new Area();
		a1.showArea(74);

	}

}
