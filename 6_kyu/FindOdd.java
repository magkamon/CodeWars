public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findNumberAppearingOddNumberOfTimes(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }

    public static int findNumberAppearingOddNumberOfTimes(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            int count = 0;
            for (int i : numbers) {
                if (number == i) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                result = number;
            }
        }
        return result;
    }

}
