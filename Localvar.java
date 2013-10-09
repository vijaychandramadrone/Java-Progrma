class Localvar
{
  public void add()
  { 
    int a=10;
	int b=20;
	int c=30;
	if(b==20)
	{
	  a++;
	}
	if(c==40)
	{
	  a++;
	}
	System.out.println("a:::"+a);
  }
  public static void main(String args[])
  {
    Localvar v = new Localvar();
	v.add();
  }
}