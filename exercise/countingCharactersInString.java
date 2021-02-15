import java.util.*;

class countingCharactersInString {

    public static String StringChallenge(String str) {
        if(str.isEmpty()){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        char character = str.charAt(0);
        for (int i = 1; i < str.length(); i++){
            if(character == str.charAt(i))
                count = count +1;
            else {
                stringBuilder.append(count).append(character);
                character = str.charAt(i);
                count = 1;
            }
        }
        stringBuilder.append(count).append(character);
        return stringBuilder.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }
}