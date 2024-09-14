import java.util.*;
public class Test1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int b1,b2;
        long dec = 0,counter;
        System.out.println("Enter the base which the number is represented in:");
        int base1 = sc.nextInt();
        System.out.println("Enter the base which you wish to transform to:");
        int base2 = sc.nextInt();
        System.out.println("Enter the number you wish to to transform:");
        String n = sc.next(),result = "";

        //b1 = Character.getNumericValue(base1);
        //b2 = Character.getNumericValue(base2);

        if(base1 < 2 || base1 > 32 || base2 < 2 || base2 > 32){
            System.out.println("Invalid base");
        }
        //else if() abs(N10)≤100000000000000 N*10 or N in base 10
        else{
            //convert from given base to base 10 (decimal)
            //check if negative
            boolean neg = false;
            if(n.substring(0,1).equals("-")){
                n = n.substring(1);
                neg = true;
            }
            dec = Long.parseLong(n,base1); //converts n to int and decimal with given base
            //System.out.println(dec + "test"); //test output of base 10
            if(base2 == 10){
                System.out.println(dec);
            }
            else {
                //convert from base 10 to desired base
                while (dec != 0) {
                    counter = dec % base2;
                    //System.out.println(counter); test
                    switch ((int) counter) {
                        case 10:
                            result = 'a' + "" + result;
                            break;
                        case 11:
                            result = 'b' + "" + result;
                            break;
                        case 12:
                            result = 'c' + "" + result;
                            break;
                        case 13:
                            result = 'd' + "" + result;
                            break;
                        case 14:
                            result = 'e' + "" + result;
                            break;
                        case 15:
                            result = 'f' + "" + result;
                            break;
                        case 16:
                            result = 'g' + "" + result;
                            break;
                        case 17:
                            result = 'h' + "" + result;
                            break;
                        case 18:
                            result = 'i' + "" + result;
                            break;
                        case 19:
                            result = 'j' + "" + result;
                            break;
                        case 20:
                            result = 'k' + "" + result;
                            break;
                        case 21:
                            result = 'l' + "" + result;
                            break;
                        case 22:
                            result = 'm' + "" + result;
                            break;
                        case 23:
                            result = 'n' + "" + result;
                            break;
                        case 24:
                            result = 'o' + "" + result;
                            break;
                        case 25:
                            result = 'p' + "" + result;
                            break;
                        case 26:
                            result = 'q' + "" + result;
                            break;
                        case 27:
                            result = 'r' + "" + result;
                            break;
                        case 28:
                            result = 's' + "" + result;
                            break;
                        case 29:
                            result = 't' + "" + result;
                            break;
                        case 30:
                            result = 'u' + "" + result;
                            break;
                        case 31:
                            result = 'v' + "" + result;
                            break;
                        case 32:
                            result = 'w' + "" + result;
                            break;
                        default:
                            result = counter + "" + result;
                    }
                    dec /= base2;
                }
                if (neg == true) {
                    result = '-' + result;
                }
                System.out.println(result);
            }
        }

    }
}
