class Mythread implements Runnable
{
  public void run()
  {
   for(int i=0;i<=10;i++)
   {
    System.out.println(i);
	try
	{
	  Thread.sleep(5000);
	}
	catch(Exception e)
	{
	}
	if(i>7)
	{
	  System.exit(1);
	}
   }
	
  }
  public static void main(String args[])
  {
    Thread t = new Thread(new Mythread());
	t.start();
  }
}