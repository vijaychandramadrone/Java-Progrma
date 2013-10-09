class ReturnMethod
{
  public int add()
  {
    int a=10;
	int b=10;
	int c = a+b;
	System.out.println("Value of c is :: "+c);
	return c;
  }
  public void display()
  {
    add();
	System.out.println("Display method");
  }
  public static void main(String arg[])
  {
    ReturnMethod rm = new ReturnMethod();
	rm.display();
  }
}