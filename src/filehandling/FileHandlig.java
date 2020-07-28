package filehandling;

import java.io.File;

public class FileHandlig {

	public static void main(String[] args) {
		File myfile = new File("D:\\tutorial\\file1.txt");
		if(myfile.exists()) {
			System.out.println("name of file " + myfile.getName());
			System.out.println("readable " + myfile.canRead());
			System.out.println("writeble " + myfile.canWrite());
			System.out.println("path of file " + myfile.getAbsoluteFile());
			System.out.println("file size in bytes " + myfile.length());
		}
		else
			System.out.println("file doen't exist");
	}

}
