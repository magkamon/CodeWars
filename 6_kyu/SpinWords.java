public class SpinWords {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("Welcome"));
    }

    public static String spinWords(String sentence) {
    StringBuilder result = new StringBuilder();
    String [] splitSentence = sentence.split(" ");

        for (String word:splitSentence) {
            if(word.length()>4){
                StringBuilder wordSb = new StringBuilder(word);
                wordSb.reverse();
                result.append(wordSb).append(" ");
            }else {
                result.append(word).append(" ");
            }
        }
    return result.toString().trim();
    }
}
