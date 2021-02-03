public class GetTheMiddleCharacter {
    public static void main(String[] args) {

        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
        System.out.println(getMiddle("AB"));
    }
    public static String getMiddle(String word) {
        if((word.length()%2) == 0 ){
            return word.charAt((word.length() / 2) - 1) + Character.toString(word.charAt(word.length()/2));
        }
        else{
            return Character.toString(word.charAt((word.length()/2)));
        }
    }
}
