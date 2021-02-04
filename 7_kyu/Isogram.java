public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("TEST"));
        System.out.println(isIsogram("mag"));
        System.out.println(isIsogram("abcdefghij"));
    }

    public static boolean  isIsogram(String str) {
        String [] letters = str.split("");
        for(int i = 0; i < letters.length; i++){
            for (int j = i+1; j < letters.length; j++){
                if(letters[i].equalsIgnoreCase(letters[j])){
                    return false;
                }
            }
        }
        return true;
    }
}