package week11;
import java.io.FileWriter;
import java.io.*;
public class MyFileWriter {
	public static void main(String args[]) throws IOException {
		//first , we make the object of FileWriter class
		try {
			FileWriter fw = new FileWriter("TestFile.txt");
			String s = "\nAll the best for your exams dear Students.\n";
			// toCharArray() is method to convert a string in a Character array
			
			char ch[] = s.toCharArray();
			for (int i = 0; i < ch.length; i++)
				fw.write(ch[i]);
			s = "Good luck and Prepare Well.";
			fw.write(s);
			fw.close();
			int i = 0;
			FileReader fr = new FileReader("TestFile1.txt");
			while((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		}
		catch(FileNotFoundException nfe ) {
			System.out.print("Invalid file Name\nFile does not exists.");
		}
		
	}

}

