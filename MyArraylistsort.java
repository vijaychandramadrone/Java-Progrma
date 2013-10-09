import java.util.*;
class MyArraylistsort
{
public static void main(String args[])
  {
    List ar = new ArrayList();
    ar.add("vijay");
    ar.add("ravi");
    ar.add("sharat");
    System.out.println("b4 sorting "+ar);
    Collections.sort(ar);
    System.out.println("After Sorting"+ar);
  }
}