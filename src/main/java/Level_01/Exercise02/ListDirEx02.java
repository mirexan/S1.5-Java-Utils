package Level_01.Exercise02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListDirEx02 {

	public void listDir2(File dir, String tab) {
		if (!dir.exists()) {
			throw new RuntimeException("Error theres is no \"" + dir
					+ "\" directory.");
		}
		List<File> files = Arrays.asList(dir.listFiles());
		Collections.sort(files);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (File file : files) {
			String type = file.isDirectory() ? "(D)" : "(F)";
			String modificationDate = sdf.format(file.lastModified());
			System.out.println(tab + file.getName() + " is a " + type
					+ " with modification date: " +  modificationDate);
			if (file.isDirectory()) {
				System.out.println("...Accessing to directory " + file.getName());
				listDir2(file, "\t");
			}
		}
	}
}
