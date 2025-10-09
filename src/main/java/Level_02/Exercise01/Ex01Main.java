package Level_02.Exercise01;
/*Execute exercise 3 from the previous level by parameterizing all methods in a configuration file.
	You can use a Java Properties file, or the Apache Commons Configuration library if you prefer.
	From the previous exercise, parameterize the following:
		Directory to read
		Name and directory of the resulting TXT file*/

import java.io.File;

public class Ex01Main {
	public static void main(String[] args) {
		ListDir ob = new ListDir();
		ob.start();
	}
}
