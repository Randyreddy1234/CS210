import java.util.*;
public class Question_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int digits = num.length(), sum = 0;

        if(digits < 4 || digits > 30){
            System.out.println("Invalid Credit Card Length");
        }
        else{
            int [] arr = new int[digits];

            for(int i = 0; i < arr.length; i++){
                arr[i] = Character.getNumericValue(num.charAt(digits - 1));
                digits--;
            }

            for(int i = 0; i < arr.length; i++){
                if(i % 2 != 0){
                    arr[i] = arr[i] * 2;
                    if(arr[i] > 9){
                        arr[i] -= 9;
                    }
                }
            }

            for(int i = 0; i < digits; i++){
                sum += arr[i];
            }

            if(sum % 10 == 0){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }


    }
}
