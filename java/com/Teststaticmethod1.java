package java.com;
class Teststaticmethod1 extends Teststaticmethod
{
  public static void add(int a,int b)
  {
    System.out.println(a+b);
  }
  public static void main(String args[])
  {
    Teststaticmethod1 tsm1 = new Teststaticmethod1();
	tsm1.add(5,6);
  }
}