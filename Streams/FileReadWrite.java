package streams;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		FileReader in = new FileReader("countCharacters.txt");
		
		FileWriter out = new FileWriter("fileWriter.txt");
		
		int i;
		while((i=in.read())!=-1) {
			out.write((char)i);
		}
		in.close();
		out.close();

	}

}
