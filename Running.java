class Running
{
  public void runcode()
  {
     try{
     while(true)
	 {
	   Thread t = new Thread();
	   System.out.println("Program running");
	   t.sleep(10000);
	 }
	}
	catch(Exception e)
	{
	}
  }
  public static void main(String args[])
  {
    Running r = new Running();
	r.runcode();
  }
}