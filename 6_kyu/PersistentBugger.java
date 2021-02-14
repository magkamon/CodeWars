public class PersistentBugger {

    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    public static int persistence(long num1) {
        if (num1 < 10) {
            return 0;
        }
        long num2 = 1;
        while (num1 != 0) {
            num2 = num2 * (num1 % 10);
            num1 = num1 / 10;
        }
        return 1 + persistence(num2);
    }
}
