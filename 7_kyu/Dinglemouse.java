public class Dinglemouse {
    public static void main(String[] args) {
        printFrequencies();
    }

    public static int[] paintLetterboxes(final int start, final int end) {
        int[] frequencies = new int[10];
        for (int i = start; i <= end; i++){
            int number = i;
            while (number > 0){
                int residual = number %10;
                frequencies[residual] = frequencies[residual] + 1;
                number = number/10;
            }
        }
        return frequencies;
    }

    public static void printFrequencies() {
        int[] frequencies = paintLetterboxes(125,132);
        for (int frequency : frequencies) {
            System.out.println(frequency);
        }
    }
}
