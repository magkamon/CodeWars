public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            stringBuilder.append(Character.toUpperCase(ch));
            for (int j = 0; j < i; j++){
                stringBuilder.append(ch);
            }
        stringBuilder.append("-");
        }
        return stringBuilder.delete(stringBuilder.length()-1,(stringBuilder.length())).toString();
    }

}
