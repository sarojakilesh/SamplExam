package exceptions.basic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
public static void main(String [] args) {
    Employee e = new Employee();
    e.name = "Reyan Ali";
    e.address = "Phokka Kuan, Ambehta Peer";
    e.SSN = 12233;
    e.number = 101;
    
    try {
       FileOutputStream fileOut =
       new FileOutputStream("C:\\Users\\ravis\\Desktop\\java");
       ObjectOutputStream out = new ObjectOutputStream(fileOut);
       out.writeObject(e);
       out.close();
       fileOut.close();
       System.out.printf("Serialized data is saved in C:\\Users\\ravis\\Desktop\\java");
    } catch (IOException i) {
       i.printStackTrace();
    }
 }
}
