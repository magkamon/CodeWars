import java.util.stream.Stream;

public class FindShort {
    public static void main(String[] args) {
        System.out.println(findShortestWord("a bb ccc dddd eeeee"));
    }

    public static int findShortestWord(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

