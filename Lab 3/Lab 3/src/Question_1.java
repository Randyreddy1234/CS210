import java.util.*;
public class Question_1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number of the range: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number of the range: ");
        int end = sc.nextInt();
        int count = 0, prime = 0;

        if(start < 0 || end < 0 || start > Integer.MAX_VALUE || end > Integer.MAX_VALUE){
            System.out.println("Invalid Range!");
        }
        else {
            for(int i = start; i <= end; i++){
                for(int j = 2; j <= (int) Math.sqrt(i); j++){
                    if(i % j == 0){
                        count++;
                    }
                }

                if(count == 0){
                    prime++;
                }
                count = 0;
            }

            System.out.println("There are " + prime + " prime number in the range " + start + " to " + end);
        }


    }
}
