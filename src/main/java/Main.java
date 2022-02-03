import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long ts = TimeUnit.MILLISECONDS.toSeconds(1638361152000l);
        long reverseTs = TsToReverse.exec(ts);
        System.out.println("Reverse Ts: " + reverseTs);
        String dateString = ReverseToString.exec(reverseTs);
        System.out.println("Date:" + dateString);
        
        // long rts = 9223370398071261846l;
        // String dateString2 = ReverseToString.exec(rts);
        // System.out.println("Custom rts:" + dateString2);
    }
}
