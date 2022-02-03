import java.text.ParseException;

public class Main {
    public static long getReverseTsFromDateString(String dateString) {
        try {
            return TsToReverse.exec(StringToTs.exec(dateString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getDateStringFromReverseTs(long rts) {
        return ReverseToString.exec(rts);
    }

    public static void main(String[] args) {
        // String dateString = "2021-12-01 00:00:01.000";
        // long reverseTs = getReverseTsFromDateString(dateString);
        // System.out.println("Reverse Ts: " + reverseTs);
        
        long rts = 9223370398509174807l;
        String dateString = getDateStringFromReverseTs(rts);
        System.out.println(dateString);
    }
}
