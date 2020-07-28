package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter= new FileWriter("D:\\tutorial\\file1.txt");
			myWriter.append("hi there! ");
			myWriter.append("ggg");
			myWriter.close();
			System.out.println("succesfuly writen to file");
		}catch(IOException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}

}
