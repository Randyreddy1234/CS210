import java.util.*;
class Brain{
    // creating the 2D boolean array to store which paths have been visited
    // [19][19] set to true to start there
    Arr hasVisited =  new Arr();
    int x = 19,y = 19;
    // creating stack based on node object
    // Stack used to keep track of the path followed, each successful move will push a node with the co-ords of the 2D array in
    // and the direction it moved
    Stack<Node> stack = new Stack<Node>();

    public String getMove(boolean north, boolean south, boolean east, boolean west){
        Node temp = new Node();

        if (north && !hasVisited.beenVisited(x-1,y)){
            hasVisited.Visited(x-1,y);
            temp.setX(x-1);
            temp.setY(y);
            temp.setDir("south");
            stack.push(temp);
            return "north";
        } else if (south && !hasVisited.beenVisited(x+1,y)) {
            hasVisited.Visited(x+1,y);
            temp.setX(x+1);
            temp.setY(y);
            temp.setDir("north");
            stack.push(temp);
            return "south";
        } else if (east && !hasVisited.beenVisited(x,y+1)) {
            hasVisited.Visited(x,y+1);
            temp.setX(x);
            temp.setY(y+1);
            temp.setDir("west");
            stack.push(temp);
            return "east";
        } else if(west && !hasVisited.beenVisited(x,y-1)){
            hasVisited.Visited(x,y-1);
            temp.setX(x);
            temp.setY(y-1);
            temp.setDir("east");
            stack.push(temp);
            return "west";
        }
        else{
            Node goBack = stack.pop();
            String backDirection = goBack.getDir();
            if(backDirection.equals("north")){
                x--;
            }
            if(backDirection.equals("south")){
                x++;
            }
            if(backDirection.equals("east")){
                y++;
            }
            if(backDirection.equals("west")){
                y--;
            }
            return backDirection;
        }
    }
}

//representing every block in the maze being visited as a node that will be pushed into a stack
//have a node object
class Node{
    private int x,y;
    private String dir;
    public Node(){
        x = 19;
        y = 19;
        dir = ""; //default direction is west when node is made
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getDir(){
        return dir;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setDir(String dir) {
        this.dir = dir;
    }
}

class Arr{
    boolean [][] visited = new boolean[40][40];

    public Arr(){
        //setting all blocks in visited array to false as no paths visited yet
        for(int i = 0; i < visited.length; i++){
            for (int j= 0; j<visited[i].length;j++){
                visited[i][j] = false;
            }
        }
        //start at [19][19] (middle) so freedom of space in the array
        visited[19][19] = true;
    }

    public void Visited(int i, int j){
        visited[i][j] = true;
    }

    public boolean beenVisited(int x, int y){
        return visited[x][y];
    }
}