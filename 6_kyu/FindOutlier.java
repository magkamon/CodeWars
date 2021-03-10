public class FindOutlier{

    public static void main(String[] args) {
        int[] numbers = {2, 4, 0, 100, 4, 11, 2602, 36};
        int[] numbers1 = {160, 3, 1719, 19, 11, 13, -21};

        System.out.println(find(numbers));
        System.out.println(find(numbers1));
    }

    static int find(int[] integers) {
        int notGood = integers[0];
        if (isOdd(integers)) {
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    notGood = integer;
                }
            }
        } else {
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    notGood = integer;
                }
            }
        }
        return notGood;
    }

    static boolean isOdd(int[] integers){
        int counterOdd = 0;
        int counterEven = 0;
        for (int integer : integers) {
            if (integer % 2 == 0) {
                counterOdd++;
            } else {
                counterEven++;
            }
        }
        return counterOdd > counterEven;
    }
}