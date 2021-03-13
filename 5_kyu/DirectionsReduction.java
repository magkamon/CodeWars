import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectionsReduction {

    public static void main(String[] args) {
        String[] directions = { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
        String[] directions2 = { "NORTH", "SOUTH","SOUTH","SOUTH", "SOUTH", "WEST", "NORTH", "WEST" };

        String[] res = directionReduction(directions2);
        for (String r:res){
            System.out.println(r);
        }
    }

    public static String[] directionReduction(String[] arr) {

        EnumMap<Direction, Long> directions =
                Stream.of(arr).collect(Collectors.toMap(Direction::valueOf, v -> 1L, Long::sum,
                        ()-> {
                            EnumMap<Direction, Long> enumMap = new EnumMap<>(Direction.class);
                            EnumSet.allOf(Direction.class).forEach(v -> enumMap.put(v,0L));
                            return enumMap;
                        }
                        ));

        long northSouth = directions.get(Direction.NORTH) - directions.get(Direction.SOUTH);
        long westEast = directions.get(Direction.WEST) - directions.get(Direction.EAST);

        ArrayList<String> result = new ArrayList<>();
        if(northSouth > 0){
            result = repeatDirections(Math.abs(northSouth),"NORTH");
        }else if(northSouth < 0){
            result.addAll(repeatDirections(Math.abs(northSouth),"SOUTH"));
        }
        if(westEast > 0){
            result.addAll(repeatDirections(Math.abs(westEast),"WEST"));
        }else if (westEast < 0){
            result.addAll(repeatDirections(Math.abs(westEast),"EAST"));
        }

        return result.toArray(String[]::new);
    }

    public static ArrayList<String> repeatDirections(Long counter, String direction){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < counter; i++){
            result.add(direction);
        }
        return result;
    }

    private enum Direction{
        NORTH ("NORTH"),
        SOUTH ("SOUTH"),
        EAST ("EAST"),
        WEST ("WEST");

        String direction;

        Direction (String direction){
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }
    }
}
