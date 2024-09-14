import java.util.*;
class Test2 {
    //this is the dumbest possible strategy - random
    private String prev = "",direction = "";
    private Set <String> visited = new HashSet<>();
    public String getMove(boolean north, boolean south, boolean east, boolean west) {
        if (north && !south && !east && !west) {
            if(!visited.contains("north")){
                prev = "north";
                direction = "north";
            }
        } else if (!north && south && !east && !west) {
            if(!visited.contains("south")){
                prev = "south";
                direction = "south";
            }
        } else if (!north && !south && east && !west) {
            if(!visited.contains("east")){
                prev = "east";
                direction = "east";
            }
        } else if(!north && !south && !east && west){
            if(!visited.contains("west")){
                prev = "west";
                direction = "west";
            }
        }/* else if (!north && south && east && west) {
            int random = (int) (Math.random() * 2);
            switch (random) {
                case 0:
                    return "south";
                case 1:
                    return "east";
                default:
                    return "west";
            }
        } else if(north && !south && east && west){
            int random = (int) (Math.random() * 2);
            switch (random) {
                case 0:
                    return "north";
                case 1:
                    return "east";
                default:
                    return "west";
            }
        }else if (north && south && !east && west){
            int random = (int) (Math.random() * 2);
            switch (random) {
                case 0:
                    return "north";
                case 1:
                    return "south";
                default:
                    return "west";
            }
        }else if(north && south && east && !west){
            int random = (int) (Math.random() * 2);
            switch (random) {
                case 0:
                    return "north";
                case 1:
                    return "south";
                default:
                    return "east";
            }
        }else if (north && south && !east && !west){
            int random = (int) (Math.random() * 1);
            switch (random) {
                case 0:
                    return "north";
                default:
                    return "south";
            }
        }else if (!north && !south && east && west){
            int random = (int) (Math.random() * 1);
            switch (random) {
                case 0:
                    return "east";
                default:
                    return "west";
            }
        } */
        else{
            /*
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    return "north";
                case 1:
                    return "south";
                case 2:
                    return "east";
                default:
                    return "west";
            }
             */
            String[] directions = {"north", "south", "east", "west"};
            int random = (int) (Math.random() * 4);
            for (int i = 0; i < 4; i++) {
                String randomDirection = directions[(random + i) % 4];
                if (!randomDirection.equals(prev) &&
                        !visited.contains(randomDirection)) {
                    prev = randomDirection;
                    direction = randomDirection;
                }
            }
        }
        return direction;
    }
}