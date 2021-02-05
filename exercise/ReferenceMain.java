import java.util.Arrays;
import java.util.List;

//exercise from InfoShare Academy
public class ReferenceMain {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "orange", "strawberry", "Pear", "leMoN");

//    for( String word : fruits){
//        String newWord = word + "NEW";
//        System.out.println(newWord);
//    }

//        fruits.forEach(word -> {
//            String newWord = word + "NEW";
//            System.out.println(newWord);
//        });

//      fruits.forEach(word -> ReferenceMain.calculateAndPrint(word));

//      fruits.forEach(ReferenceMain::calculateAndPrint);

        ReferenceMain referenceMain = new ReferenceMain();
        fruits.forEach(referenceMain::nonStaticCalculateAndPrint);
    }

    public static void calculateAndPrint(String word){
        String newWord = word + "NEW";
        System.out.println(newWord);
    }
    public void nonStaticCalculateAndPrint(String word){
        String newWord = word + "NEW";
        System.out.println(newWord);
    }
}
