public class MultipliedBy3Or5 {
    public static void main(String[] args) {

    }

    public int getSumOfMultiples(int number){
        int sum = 0;
        for(int i = 0; i < number; i++ ){
            if( i % 3 == 0 || i % 5 == 0)
                sum = sum + i;
        }
        return sum;
    }
}
