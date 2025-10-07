package Level_01.Exercise01;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ListDirEx01 {

	public void listDir(File dir) {
		if (!dir.isDirectory() || !dir.exists()) {
			throw new RuntimeException("Error theres is no \"" + dir
					+ "\" directory.");
		}
		List<File> files = Arrays.asList(dir.listFiles());
		Collections.sort(files);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}
