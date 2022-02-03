import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReverseToString {
    public static final String DATE_FORMAT = "yyyyMMddHHmmssSSS";

    public static String exec(long timestamp) {

        long convert = Long.MAX_VALUE - timestamp;
        return new Date(TimeUnit.SECONDS.toMillis(convert)).toString();
    }
}
