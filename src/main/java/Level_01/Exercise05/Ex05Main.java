package Level_01.Exercise05;

import java.io.IOException;

public class Ex05Main {
	public static void main(String[] args) throws IOException {
		 SerialObject object = new SerialObject("Olga");
		try {
			object.serialize();
			object.deSerialize();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
