import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("ABBA"));
    }

    public static int duplicateCount(String text) {
        List<String> textForCheck = Arrays.asList(text.toLowerCase().split(""));
        return (int) textForCheck.stream().filter(s -> Collections.frequency( textForCheck, s) > 1).distinct().count();
    }
}
