import java.util.*;
public class Question1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many words you want evaluated: ");
        int numWords = sc.nextInt();
        sc.nextLine();
        if(numWords < 0 || numWords > 100){
            System.out.println("Invalid number of words to evaluate");
        }
        else{
            String [] words = new String[numWords];
            int [] score = new int[numWords];
            int counter = 0,temp;
            String temp1 = "";
            System.out.println("Enter the words being evaluated:");

            for(int i = 0; i < words.length; i++){
                words[i] = sc.nextLine();
            }

            for(int i = 0; i < words.length;i++){
                for(int j = 0; j < words[i].length();j++){
                    String let = String.valueOf(words[i].charAt(j));
                    if(let.equalsIgnoreCase("A") || let.equalsIgnoreCase("E") ||
                            let.equalsIgnoreCase("I") || let.equalsIgnoreCase("O") || let.equalsIgnoreCase("U") ||
                            let.equalsIgnoreCase("L") || let.equalsIgnoreCase("N") || let.equalsIgnoreCase("S") ||
                            let.equalsIgnoreCase("T") || let.equalsIgnoreCase("R")){
                                 counter++;
                    }
                    if(let.equalsIgnoreCase("D") || let.equalsIgnoreCase("G")){
                        counter += 2;
                    }
                    if(let.equalsIgnoreCase("B") || let.equalsIgnoreCase("C") || let.equalsIgnoreCase("M") || let.equalsIgnoreCase("P")){
                        counter += 3;
                    }
                    if(let.equalsIgnoreCase("F") || let.equalsIgnoreCase("H") || let.equalsIgnoreCase("V")
                            || let.equalsIgnoreCase("W") || let.equalsIgnoreCase("Y")){
                                counter += 4;
                    }
                    if(let.equalsIgnoreCase("K")){
                                counter += 5;
                    }
                    if(let.equalsIgnoreCase("J") || let.equalsIgnoreCase("X")){
                                counter += 8;
                    }
                    if(let.equalsIgnoreCase("Q") || let.equalsIgnoreCase("Z")){
                                counter += 10;
                    }
                }
                score[i] = counter;
               // System.out.println(score[i]);
                counter = 0;
            }
           // System.out.println("Sort");
            for(int i = 0; i < words.length - 1;i++){
                for(int j = 1; j < words.length ;j++){
                    if(score[i] > score[j]){
                        temp = score[j];
                        score[j] = score[i];
                        score[i] = temp;

                        temp1 = words[j];
                        words[j] = words[i];
                        words[i] = temp1;
                    }
                    else if(score[i] == score[j]){
                        if(words[i].compareTo(words[j]) > 0){
                            temp = score[j];
                            score[j] = score[i];
                            score[i] = temp;

                            temp1 = words[j];
                            words[j] = words[i];
                            words[i] = temp1;
                        }
                    }
                }
            }

           // System.out.println("Points:" + " Words:");
            for(int i = 0; i < words.length; i++){
                System.out.println(/*score[i] + "    " +*/ words[i]);
            }
        }
    }
}
