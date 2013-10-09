class B
 {
    static int x=9;
    static void triple () 
	{
	  x=x*3;
	  System.out.println(x);
	}

}

class C extends B 
{
    static void triple () 
	{
	 x=x+3;
	 System.out.println(x);
	} 
}

public class GetRich {
    public static void main(String[] args) {
       C c = new C();
	   c.triple();
    }
}