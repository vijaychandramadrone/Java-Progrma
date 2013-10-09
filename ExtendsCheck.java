class Furniture 
{
  public void furniture()
  {
    System.out.println("I m in furniture class");
  }
}
class Table extends Furniture
{
  public void furniture()
  {
    System.out.println("i m in table class");
  }
}
class Bench extends Table
{
  public void furniture()
  {
    Furniture f = new Furniture();
	f.furniture();
    System.out.println("i m in bench class");
  }
}
class ExtendsCheck
{
  public static void main(String args[])
  {
    Bench b = new Bench();
	b.furniture();
  }
}