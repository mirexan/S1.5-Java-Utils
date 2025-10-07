package Level_01.Exercise03;

import java.io.File;

public class Ex03Main {
	public static void main(String[] args) {
		File dir = new File(".." + File.separator);
		ListDirEx03 obj = new ListDirEx03();
		obj.listDir3ToFile(dir,"");
	}
}
