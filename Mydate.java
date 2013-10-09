import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Mydate {

    public static void main(String[] args) {
        Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        System.out.println(format.format(now));
    }
}