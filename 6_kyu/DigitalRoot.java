public class DigitalRoot {

    public static void main(String[] args) {
        System.out.println(digitalRoot(493193));
    }

    public static int digitalRoot(int number) {
        int lastNumber = 0;
        int sum = 0;

        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            lastNumber = number %10;
            sum = sum + lastNumber;
            number = number /10;
        }
        return sum;
    }
}
