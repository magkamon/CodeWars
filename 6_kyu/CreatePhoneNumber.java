public class CreatePhoneNumber {
    public static void main(String[] args) {
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(num));
    }

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "";
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0)
                phoneNumber += '(';
            else if (i == 3)
                phoneNumber += ") ";
            else if (i == 6)
                phoneNumber += '-';
            phoneNumber += numbers[i];
        }
        return phoneNumber;
    }
}
