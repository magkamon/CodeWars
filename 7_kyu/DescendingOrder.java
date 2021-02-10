import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
    }

    public static int sortDesc(final int num) {
    String [] numbers = String.valueOf(num).split("");
//    Arrays.sort(numbers, Collections.reverseOrder());
    Arrays.sort(numbers);
    String result = "";
    for(String s : numbers){
        result = s + result;
    }
    return Integer.parseInt(result);
    }
}
