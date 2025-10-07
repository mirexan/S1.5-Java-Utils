package Level_01.Exercise04;

import java.io.File;

public class Ex04Main {
	public static void main(String[] args) {
		File dir = new File("." + File.separator);
		readTxtFile obj = new readTxtFile();
		obj.readTxt(dir);
	}
}
