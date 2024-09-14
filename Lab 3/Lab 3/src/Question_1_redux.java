import java.util.*;
public class Question_1_redux {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number of the range: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending number of the range: ");
        int end = sc.nextInt();
        int reverse = 0, prime = 0;
        long start1 = System.nanoTime();

        if(start < 0 || end < 0 || start > Integer.MAX_VALUE || end > Integer.MAX_VALUE){
            System.out.println("Invalid Range!");
        }
        else {
            if(start > end){
                reverse = end;
                end = start;
                start = reverse;
            }

            boolean [] sieve = new boolean[Math.toIntExact(Math.round(Math.sqrt(end - start)))+1];

            for(int i = 2; i < sieve.length; i++) {
                sieve[i] = true;
            }

            for(int i = 2; i < sieve.length;i++){
                if(sieve[i]){
                    prime++;
                    for(int j = i*i; j <= sieve.length; j += i){
                        if(j % i == 0){
                            sieve[j] = false;
                        }
                    }
                }
            }
            long end1 = System.nanoTime();
            System.out.println("There are " + prime + " prime number in the range " + start + " to " + end);
            System.out.println(end1-start1);

        }
    }
}