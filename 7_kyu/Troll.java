public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("apple"));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]","");
    }
}
