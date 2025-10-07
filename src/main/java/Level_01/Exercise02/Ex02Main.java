package Level_01.Exercise02;

import java.io.File;

public class Ex02Main {
	public static void main(String[] args) {
		File dir = new File(".." + File.separator);
		ListDirEx02 obj = new ListDirEx02();
		obj.listDir2(dir,"");
	}
}
