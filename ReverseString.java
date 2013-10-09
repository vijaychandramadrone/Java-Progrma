class ReverseString
{
  private static void main(String args[])
  {
    String name ="hello world";
	char[] chr = name.toCharArray();
	for(int i=0;i<chr.length;i++)
	{ 
	  System.out.print(chr[((chr.length-1)-i)]);
	}
  }
}