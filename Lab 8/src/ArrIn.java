import java.util.Arrays;
import java.util.Scanner;
public class ArrIn {
    FileIO reader = new FileIO();
    String[] input = reader.load("queue.txt"); //Reading the File as a String array

    public String [] array(){
        return input;
    }
}