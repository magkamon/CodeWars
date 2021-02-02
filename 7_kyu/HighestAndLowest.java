public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String highAndLow (String numbers) {
        String [] numbersInStringArray = numbers.split(" ");
        Integer [] numbersInIntegerArray = new Integer[numbersInStringArray.length];
        for (int i = 0; i < numbersInStringArray.length; i++){
            numbersInIntegerArray[i] = Integer.parseInt(numbersInStringArray[i]);
        }
        Integer min = numbersInIntegerArray[0];
        Integer max = numbersInIntegerArray[0];
        for (Integer integer : numbersInIntegerArray) {
            if (min > integer) {
                min = integer;
            }
            if (max < integer) {
                max = integer;
            }
        }
        return max.toString() + " " + min.toString();
    }
}
