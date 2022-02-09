package streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterInOut {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("countCharacters.txt");
		FilterInputStream in = new BufferedInputStream(fin);
		FileOutputStream fout = new FileOutputStream("filterOut.txt");
		FilterOutputStream out = new BufferedOutputStream(fout);
		
		int i;
		while((i=in.read())!=-1) {
			out.write((char)i);
		}
		
		in.close();
		out.close();
		

	}

}
