import java.util.*;
import java.lang.*;
public class StringReverse
{
public static void main(String []args) 
 {
   String str1="Hello World";
   String str3="";
   String[] strarr=str1.split("");
   StringBuffer str22=new StringBuffer();
   for(int i=str1.length();i>0;i--)
        {
          str22.append(strarr[i]);
        }
   String mynewstring = str22.toString();
   System.out.println("mynewstring"+mynewstring);
  }
}
