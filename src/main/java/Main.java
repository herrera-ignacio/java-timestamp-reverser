import java.text.ParseException;

public class Main {
    public static long getReverseTsFromDateString(String dateString) {
        try {
            return TsToReverse.exec(StringToTs.exec(dateString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String dateString = "2021-12-15 12:34:56.789";
        long reverseTs = getReverseTsFromDateString(dateString);
        System.out.println("Reverse Ts: " + reverseTs);
    }
}
