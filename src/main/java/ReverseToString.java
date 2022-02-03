import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReverseToString {
    public static final Long MAX_TIME = 999999999999999999l;
    public static final String DATE_FORMAT = "yyyyMMddHHmmssSSS";

    public static Long exec(long timestamp) {

        Long convert = MAX_TIME - timestamp;
        try {
            return new SimpleDateFormat(DATE_FORMAT).parse(Long.toString(convert)).getTime();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
