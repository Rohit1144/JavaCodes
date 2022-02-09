package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

	public static void main(String[] args) throws IOException {
		FileReader fin = new FileReader("countCharacters.txt");
		BufferedReader in = new BufferedReader(fin);
		
		int i;
		while((i=in.read())!=-1) {
			System.out.println((char)i);
		}

	}

}
