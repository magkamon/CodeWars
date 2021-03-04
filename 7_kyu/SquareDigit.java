public class SquareDigit {

    public static int squareDigits(int n) {

        String[] digits = Integer.toString(n).split("");
        StringBuilder result = new StringBuilder();

        for (String digitString : digits) {
            Integer digitInt = Integer.parseInt(digitString);
            Integer outcome = digitInt * digitInt;
            result.append(outcome);
            }
        return Integer.parseInt(result.toString());
    }


}
