import java.util.*;
public class Test1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int arrTrack = 1, unique = 0;
        char [] arr = new char[25];

        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < arrTrack; j++){
                if(arrTrack == 1){
                    arr[arrTrack] = word.charAt(i);
                    arrTrack++;
                }
                else if(word.charAt(i) != 'a'){

                }
            }
        }

    }
}
