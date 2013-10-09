class repeateWork{

  public static void main(String args[])
  {
    String s = "vijay chandra kondamudi";
	char[] a = s.toCharArray();
	int len = a.length;
	for (int i=0;i<len;i++)
	{
	  System.out.print(a[(len-1)-i]);
	}
	
  }
}