import java.io.*;
import my.exception.MyException;
class TestInput{
public static void main(String args[])
{
  try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      br.readLine();
	 }
  catch(MyException e)
  {
  }
}
}