package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File myFile = new File("D:\\tutorial\\file1.txt");
		try {
			
			if(myFile.createNewFile())
				System.out.println("file successufly created" + myFile.getName());
			else
				System.out.println("file alredy exits");
		}catch(IOException e){
			System.out.println("error occured");
			e.printStackTrace();
		}

	}

}
