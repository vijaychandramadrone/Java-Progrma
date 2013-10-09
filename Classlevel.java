class Classlevel
{
   //Static b4 any varible or method makes it class level no need of calling method by reference of class by creating object.
   static int a=10; //a is class level varible
   int b=10;        //b is class level varible
   static void add(int a,int b)
   {
     int c=a+b;
	 System.out.println(c);
   }
   void sub(int a,int b)
   {
     int c=a-b;
	 System.out.println(c);
   }
  public static void main(String args[])
  {
    add(5,6);
	//sub(20,30); this will give error.Check console fr error .comment this line and see below lines.
	Classlevel cl = new Classlevel();
	cl.sub(20,30);
  }
}