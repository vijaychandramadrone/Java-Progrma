class CheckString{
 boolean check = false;
 String s = "hello and hi";
  public boolean check(String s)
  {
	if(s.equals("hello and hi")){
	  check = true;
	}
    return check;
  }  
  public static void main(String args[])
  {
     CheckString cs = new CheckString();
     //boolean result = cs.check("hello and hi");
	 if(!cs.check("hello and hi")){
	 System.out.println("value is false");
	 }
  }
}