package Level_01.Exercise03;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListDirEx03 {

	public void listDir3ToFile(File dir, String tab) {
		if (!dir.exists()) {
			throw new RuntimeException("Error theres is no \"" + dir
					+ "\" directory.");
		}
		try {
			PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
			writer.println("\n === List of Directories and files " +
					"from Level_01 directory ===\n");
			listDir3(dir, tab, writer);
		} catch (IOException e) {
			throw new RuntimeException("Error : " + e.getMessage());
		}
	}
	private void listDir3(File dir, String tab, PrintWriter writer) {
		List<File> files = Arrays.asList(dir.listFiles());
		Collections.sort(files);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (File file : files) {
			String type = file.isDirectory() ? "(D)" : "(F)";
			String modificationDate = sdf.format(file.lastModified());
			writer.println(tab + file.getName() + " is a " + type
					+ " with modification date: " + modificationDate);
			if (file.isDirectory()) {
				writer.println("...Accessing to directory " + file.getName());
				listDir3(file, "\t", writer);
			}
		}

	}
}
