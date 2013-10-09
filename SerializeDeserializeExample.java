import java.io.*;

public class SerializeDeserializeExample implements java.io.Serializable
 {
   public String name;
   public transient String address;
   public transient int rollno;
   public int roomNo;

	public static void main(String[] args) 
	{
	    SerializeDeserializeExample e = new SerializeDeserializeExample();
		e.name = "Kapil k Singh";
		e.address = "E-247,Beta-1,Noida";
		e.rollno = 513210153;
		e.roomNo = 111;
		try
		{
		  FileOutputStream fileOut = new FileOutputStream("student.ser");
		  ObjectOutputStream out = new ObjectOutputStream(fileOut);
		  out.writeObject(e);
		  out.close();
		  fileOut.close();
		  System.out.println("Object is serialized & stored in 'student.ser'");
	    }
		catch (IOException ie) 
		{
		  ie.printStackTrace();
	    }
		/* From here starts deserialization*/
		SerializeDeserializeExample ex = null;
		try 
		{
			FileInputStream fileIn = new FileInputStream("Student.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			ex = (SerializeDeserializeExample) in.readObject();
			in.close();
			fileIn.close();
		}
		catch (IOException i) 
		{
		  i.printStackTrace();
		  return;
		} 
		catch (ClassNotFoundException c)
		{
		  System.out.println("Student class not found");
		  c.printStackTrace();
		  return;
		}
		System.out.println("Deserialized Student...");
		System.out.println("Name: " + ex.name);
		System.out.println("Address: " + ex.address);
		System.out.println("Roll no: " + ex.rollno);
		System.out.println("Room No: " + ex.roomNo);
	 }
}