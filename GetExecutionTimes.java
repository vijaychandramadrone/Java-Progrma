 import java.util.*;
public class GetExecutionTimes extends Thread
{
  public GetExecutionTimes(){}
  public static void main(String args[])
  {
  long startTime = System.currentTimeMillis();
  System.out.println("startTime::::"+startTime);
  GetExecutionTimes ext=new GetExecutionTimes();
  try{
      ext.callMethod();
  }
  catch(Exception e)
  {
  }
  long endTime = System.currentTimeMillis();
  System.out.println("endTime::::"+endTime);
  System.out.println("Total elapsed time in execution of method callMethod() is :"+ (endTime-startTime));
  }
  public void callMethod()throws Exception{
  System.out.println("Calling method");
  for(int i=1;i<=10;i++)
  {
  Thread.sleep(1000);
  System.out.println("Value of counter is "+i);
  }
  }
}