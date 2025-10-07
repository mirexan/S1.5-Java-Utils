package Level_01.Exercise01;

import java.io.File;

public class Ex01Main {
	public static void main(String[] args) {
		File dir = new File(".." + File.separator);
		ListDirEx01 obj = new ListDirEx01();
		obj.listDir(dir);
	}
}
