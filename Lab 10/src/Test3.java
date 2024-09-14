import java.util.*;

class test3 {
    private String direction = "";
    private Stack<String> stack = new Stack<>();
    private Set<String> visited = new HashSet<>();

    public String getMove(boolean north, boolean south, boolean east, boolean west) {
        String prev = direction;

        if (north && !visited.contains("north")) {
            direction = "north";
        } else if (south && !visited.contains("south")) {
            direction = "south";
        } else if (east && !visited.contains("east")) {
            direction = "east";
        } else if (west && !visited.contains("west")) {
            direction = "west";
        } else {
            // If there is no clear direction, pop from the stack (backtrack)
            if (!stack.isEmpty()) {
                direction = stack.pop();
            } else {
                // If the stack is empty, use a random direction
                String[] directions = {"north", "south", "east", "west"};
                int random = (int) (Math.random() * 4);
                direction = directions[random];
            }
        }

        // Update visited set and stack
        visited.add(direction);
        if (!prev.equals(direction)) {
            stack.push(getOppositeDirection(direction));
        }

        // Update position based on the chosen direction
        updatePosition(direction);

        return direction;
    }

    private void updatePosition(String direction) {
        switch (direction) {
            case "north":
                // Update posX when moving north
                break;
            case "south":
                // Update posX when moving south
                break;
            case "east":
                // Update posY when moving east
                break;
            case "west":
                // Update posY when moving west
                break;
        }
    }

    private String getOppositeDirection(String direction) {
        switch (direction) {
            case "north":
                return "south";
            case "south":
                return "north";
            case "east":
                return "west";
            case "west":
                return "east";
            default:
                return "";
        }
    }
}
