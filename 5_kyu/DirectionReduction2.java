import java.util.Stack;

public class DirectionReduction2 {


    public static void main(String[] args) {

    }

    public static String[] directionReduction(String[] arr) {

        Stack<String> directionsReduced = new Stack<>();
        for (String direction:arr){
            if(directionsReduced.empty()){
                directionsReduced.push(direction);
            }else{
                if(isReducible(Direction.valueOf(direction), Direction.valueOf(directionsReduced.peek()))){
                    directionsReduced.pop();
                }else {
                    directionsReduced.push(direction);
                }
            }
        }
        return directionsReduced.toArray(String[]::new);

    }

    private static boolean isReducible(Direction direction1, Direction direction2){
        return direction1.equals(Direction.NORTH) && direction2.equals(Direction.SOUTH)
                || direction1.equals(Direction.SOUTH) && direction2.equals(Direction.NORTH)
                || direction1.equals(Direction.EAST) && direction2.equals(Direction.WEST)
                || direction1.equals(Direction.WEST) && direction2.equals(Direction.EAST);
    }

    private enum Direction {
        NORTH("NORTH"),
        SOUTH("SOUTH"),
        EAST("EAST"),
        WEST("WEST");

        String direction;

        Direction(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }
    }

}
