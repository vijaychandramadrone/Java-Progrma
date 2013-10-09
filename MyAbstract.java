 abstract class Animal
{
  public static void animal()
  {
    System.out.println("i m in Animal class");
  }
  public abstract void dog();
}
class MyAbstract extends Animal
{
  public static void animal()
  {
    System.out.println("i m derived call animal");
  }
  public void dog()
  {
    System.out.println("i m in drived dog method");
  }
  public static void main(String args[])
  {
    Animal a = new MyAbstract();
	//super.animal();
	a.animal();
	MyAbstract ma = new MyAbstract();
	ma.dog();
	ma.animal();
	//MyAbstract.animal();
  }
}