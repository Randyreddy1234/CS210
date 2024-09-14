import java.util.*;
public class Test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int b1,b2;
        System.out.println("Enter the base which the number is represented in:");
        char base1 = sc.next().charAt(0);
       // System.out.println("Enter the base which you wish to transform to:");
       // char base2 = sc.next().charAt(0);
        /*
        if(base1 < 2 || base1 > 32 || base2 < 2 || base2 > 32){
            System.out.println("Invalid base");
        } //implement this into default statement of switch
        else{
         */
        /*
        switch(base1){
            case 'a': //10
                b1 = 10;
                break;
            case 'b': //11
                b1 = 11;
                break;
            case 'c': //12
                b1 = 12;
                break;
            case 'd': //13
                b1 = 13;
                break;
            case 'e': //14
                b1 = 14;
                break;
            case 'f': //15
                b1 = 15;
                break;
            case 'g': //16
                b1 = 16;
                break;
            case 'h': //17
                b1 = 17;
                break;
            case 'i': //18
                b1 = 18;
                break;
            case 'j': //19
                b1 = 19;
                break;
            case 'k': //20
                b1 = 20;
                break;
            case 'l': //21
                b1 = 21;
                break;
            case 'm': //22
                b1 = 22;
                break;
            case 'n': //23
                b1 = 23;
                break;
            case 'o': //24
                b1 = 24;
                break;
            case 'p': //25
                b1 = 25;
                break;
            case 'q': //26
                b1 = 26;
                break;
            case 'r': //27
                b1 = 27;
                break;
            case 's': //28
                b1 = 28;
                break;
            case 't': //29
                b1 = 29;
                break;
            case 'u': //30
                b1 = 30;
                break;
            case 'v': //31
                b1 = 31;
                break;
            case 'w': //32
                b1 = 32;
                break;
            default:
                b1 = Character.getNumericValue(base1);
                if(b1 < 2 || b1 > 32){
                    System.out.println("Invalid");
                }

        }
    */
    b1 = Character.getNumericValue(base1);
        System.out.println(b1);
        //System.out.println(base2);
    }
}
