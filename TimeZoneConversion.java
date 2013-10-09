import java.util.*;
import java.text.*;
class TimeZoneConversion
{
public static void main(String arg[])
  {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("PST"));
        String gmtStrDate = sdf.format(Calendar.getInstance().getTime());

        System.out.println("PST Time Zone is "+gmtStrDate);
   }
}
