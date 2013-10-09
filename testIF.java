class testIF
{
  public static void main(String args[])
  {
    boolean name = true;
	String uname = "vijay";
	if(uname.equals("vijay"))
	{
	  name = false;
	}
	if(!name)
	{
	  uname = "chandra";
	}
	System.out.println(uname);
  }
}