package Level_01.Exercise04;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class readTxtFile {
	public void readTxt(File dir) {
		if (!dir.exists()) {
			throw new RuntimeException("Error theres is no \"" + dir
					+ "\" directory.");
		}
		String txt = searchTxt(dir);
		if (txt.equals("")) {
			throw new RuntimeException("Error there is no .txt file to read");
		}
		try {
			BufferedReader reader = new BufferedReader(new FileReader(txt));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			throw new RuntimeException("Error : " + e.getMessage());
		}
	}
	public String searchTxt(File dir) {
		List<File> files = Arrays.asList(dir.listFiles());
		Collections.sort(files);
		for (File file : files) {
			if (file.getName().endsWith(".txt")) {
				return file.getName();
			}
		}
		return "";
	}
}
