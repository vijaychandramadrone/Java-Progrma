import java.util.*;
class onemonthdate{
   public static void main(String args[])
   {
        int i = 1;
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(GregorianCalendar.MONTH, -i);
		Date dateBefore = gc.getTime();

		System.out.println(date);
		System.out.println(dateBefore);
    }
}