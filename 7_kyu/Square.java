public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(26));
    }

    public static boolean isSquare(int n) {
        int square = (int) Math.sqrt(n);
        return (square*square) == n;
    }
}
