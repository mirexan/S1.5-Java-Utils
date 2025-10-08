package Level_01.Exercise05;
/*Now the program must serialize a Java Object to a .ser file and then deserialize it.*/
import java.io.*;

public class SerialObject implements Serializable {

	private String name;

	public SerialObject(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	public void serialize() throws IOException {
		try (FileOutputStream fileOut = new FileOutputStream("object.ser")) {
			ObjectOutputStream serializedObject = new ObjectOutputStream(fileOut);
			serializedObject.writeObject(this);
			System.out.println("Object serialized in object.ser");
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

	public void deSerialize() throws IOException {

		try (FileInputStream fileInput = new FileInputStream("object.ser")) {
			SerialObject deSerializedObject;
			ObjectInputStream deSerializedInput = new ObjectInputStream(fileInput);
			deSerializedObject = (SerialObject) deSerializedInput.readObject();
			System.out.println("Object de-serialized with name :" + deSerializedObject.getName());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
