class Varnoargs
{
  public void add(int ... a)
  {
    for(int i=0;i<a.length;i++)
	{
	  System.out.println(a[i]);
	}
  }
  public static void main(String args[])
  {
    Varnoargs vna = new Varnoargs();
	vna.add(1,2,3);
  }
}