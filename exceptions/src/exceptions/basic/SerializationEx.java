package exceptions.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationEx implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Double salary;

	public SerializationEx(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void printdata(SerializationEx object1) {

		
		System.out.println("age = " + object1.id);
		System.out.println("name = " + object1.name);
		System.out.println("b = " + object1.salary);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializationEx ex = new SerializationEx(101, "Akilesh", 700000.00);
		FileOutputStream fout = new FileOutputStream("C:\\Users\\ravis\\Desktop\\java.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(ex);
		out.flush();
		out.close();
		System.out.println("Object successfully serialized ...");

		FileInputStream file = new FileInputStream("C:\\Users\\ravis\\Desktop\\java.txt");
		ObjectInputStream in = new ObjectInputStream(file);
	


		ex = (SerializationEx) in.readObject();

		in.close();
		file.close();
		System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
		printdata(ex);

		//System.out.println("z = " + object1.z);
	}

	@Override
	public String toString() {
		return "ObjectSerializationEx [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}






















