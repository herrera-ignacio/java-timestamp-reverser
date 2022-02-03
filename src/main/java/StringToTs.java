import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToTs {

    public static long exec(String dateString) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(dateString).getTime();
    }
}