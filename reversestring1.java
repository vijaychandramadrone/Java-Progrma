class reversestring1{
 public static void main(String args[])
 {
   String name = "vijay chandra";
   char[] name1= name.toCharArray();
   for(int i=0;i<name1.length;i++)
   {
     System.out.print(name1[(name1.length-i)-1]);
   }
 }
}