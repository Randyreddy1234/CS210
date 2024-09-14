import java.util.*;
public class Question1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int b1,b2,dec = 0;
        System.out.println("Enter the base which the number is represented in:");
        char base1 = sc.next().charAt(0);
        System.out.println("Enter the base which you wish to transform to:");
        char base2 = sc.next().charAt(0);
        System.out.println("Enter the number you wish to to transform:");
        String n = sc.next();

        b1 = Character.getNumericValue(base1);
        b2 = Character.getNumericValue(base2);

        if(b1 < 2 || b1 > 32 || b2 < 2 || b2 > 32){
            System.out.println("Invalid base");
        }
        else{
            // convert from given base to base 10
            int base = 1;
            for(int i = n.length() - 1; i >= 0; i--){
                dec += Integer.valueOf(n.charAt(i)) * base;
                base = base * b1;
                System.out.println(Integer.valueOf(n.charAt(i)));
            }


            //convert from base 10 to desired base
        }
        System.out.println(b1);
        //System.out.println(b2);
        System.out.println(dec);

    }
}
