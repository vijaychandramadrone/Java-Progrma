import java.io.*;
class WriteReadFile{
  public static void main(String args[])throws Exception
  {
    FileOutputStream fout = new FileOutputStream("E:/Java Programes/createDynamicFiles/vijay.txt");
	ObjectOutputStream oout = new ObjectOutputStream(fout);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	oout.writeObject(br.readLine());
	
	FileInputStream fin = new FileInputStream("E:/Java Programes/createDynamicFiles/vijay.txt");
	ObjectInputStream oin = new ObjectInputStream(fin);
	String s = (String) oin.readObject();
	if(s.contains("y")){
	String d = s.replace("y","h");
	System.out.println("d :"+d);
	}
  }
}