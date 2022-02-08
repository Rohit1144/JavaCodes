package collections;

import java.util.Vector;


public class VectorListt {
	private Vector<Integer> list = new Vector<Integer>();
	
	public Vector<Integer> saveEvenNumbers(int N) {
		list = new Vector<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public Vector<Integer> printEvenNumbers() {
		Vector<Integer> newList = new Vector<Integer>();
		
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}
	
	public Integer printEvenNumber(int N) {
		
		for (int item : list) {
			if(item==N) {
				return N;
			}
		}
		
		return 0;
	}


	public static void main(String[] args) {
		VectorListt e = new VectorListt();
		e.saveEvenNumbers(10);
		e.printEvenNumbers();
		int result = e.printEvenNumber(8);
		System.out.println("The number is: " + result);
		

	}

}

