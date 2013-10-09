import java.io.*;
class MyFile
{
  public static void main(String args[])throws Exception
  {
    try
	{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter any String");
	 String name = br.readLine();
	 String secname = name.substring(1,3);
	 System.out.println("Second name is "+secname);
	}
	catch(Exception e)
	{
	}
  }
}