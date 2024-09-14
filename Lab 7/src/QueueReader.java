import java.util.Arrays;
import java.util.Scanner;
public class QueueReader {
    FileIO reader = new FileIO();
    String[] input = reader.load("queue1.txt"); //Reading the File as a String array
    public static void main(String[] args) {
/*
        for (int i = 0; i < input.length; i++) {
            if (input[i].contains("INSERT")) {
                insert++;
            } else {
                remove++;
            }
        }
        System.out.println(insert + " " + remove + " " + (insert + remove));
        */
    }

    public String [] array(){
        return input;
    }
}