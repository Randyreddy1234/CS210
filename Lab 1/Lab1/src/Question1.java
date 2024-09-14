import java.util.*;
public class Question1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        boolean cont = true;

        while(cont){
            System.out.print("1. Check if a number is prime\n2. List prime numbers in a range\n3. Exit\nChoose an option (1,2 or 3): ");
            int option = sc.nextInt();

            if(option == 1){
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                int count = 0;

                for(int i = 1; i <= num; i++){
                    if(num % i == 0){
                        count++;
                    }
                }

                if(count == 2){
                    System.out.println(num + " is a prime number.");
                }
                else{
                    System.out.println(num + " is NOT a prime number.");
                }
            }
            else if(option == 2){
                System.out.print("Enter the start of the range: ");
                int start = sc.nextInt();
                System.out.print("Enter the end of the range: ");
                int end = sc.nextInt();

               int count = 0;
                System.out.print("Prime numbers in the range [" + start + "," + end + "]: " );
                for(int i = start; i <= end; i++){
                    for(int j = 1; j <= i; j++){
                        if(i % j == 0){
                            count++;
                        }
                    }

                    if(count == 2){
                        System.out.print(i + " ");
                        count = 0;
                    }
                    else {
                        count = 0;
                    }
                }
                System.out.println("");
            }
            else{
                cont = false;
            }
        }


    }

}
