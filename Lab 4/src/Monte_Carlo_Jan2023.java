import java.util.*;
public class Monte_Carlo_Jan2023{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int totalRolls = 0, N, success;

        System.out.println("Enter the number of steps to be taken: ");
        N = sc.nextInt();
        sc.close();

        for (int i = 0; i < N; i++) {
            int[] faces = {0, 0, 0, 0, 0, 0};
            boolean allFaces = false;
            success = 0;
            while(!allFaces){
                int shownFace = (int)(Math.random()*6);
                //System.out.println(shownFace);
                if(faces[shownFace] != 1){
                    faces[shownFace] = 1;
                    success++;
                }
                totalRolls++;

                if(success == 6){
                    allFaces = true;
                }
            }
        }

        System.out.println("Average number of rolls needed for all 6 sides of a dice to appear: " + (double)totalRolls/N);
    }
}