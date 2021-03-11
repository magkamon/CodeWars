public class CreatePhoneNumber {
    public static void main(String[] args) {
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(num));
    }

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0)
                phoneNumber.append('(');
            else if (i == 3)
                phoneNumber.append(") ");
            else if (i == 6)
                phoneNumber.append('-');
            phoneNumber.append(numbers[i]);
        }
        return phoneNumber.toString();
    }
}
