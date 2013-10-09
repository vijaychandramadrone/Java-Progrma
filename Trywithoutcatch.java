import java.io.*;
class Trywithoutcatch
{ 
  public void file()
  {
    try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	br.readLine();
	}
	catch(Exception e)
	{
	}
	finally
	{
	  System.out.println("hello");
	}
  }
  public static void main(String args[])
  {
    Trywithoutcatch twc = new Trywithoutcatch();
	twc.file();
  }
}