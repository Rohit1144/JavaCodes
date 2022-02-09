package streams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CopyFile {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the filename:");
		String inputfile = s.nextLine();
		System.out.println("Enter the file to write into:");
		String outputfile = s.nextLine();
		
		File file1 = new File(inputfile);
		File file2 = new File(outputfile);
		
		BufferedReader br = new BufferedReader(new FileReader(file1));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
		
		int i;
		
		while((i=br.read())!=-1) {
			bw.write(i);
		}
		
		s.close();
		br.close();
		bw.close();
		

	}

}
