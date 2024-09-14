import java.util.*;
public class Monte_Carlo_e {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter number of discreet steps for the simulation:");
        int N = sc.nextInt(),randVCount = 0;
        double e = Math.E,estimated_e;
        sc.close();

        for(int i = 0; i < N; i++){
            double tempSum = 0;
            while (tempSum < 1){
                tempSum += Math.random();//rand.nextDouble(); /*tempSum += rand.nextDouble(0,1)*/;
                randVCount++;
            }
        }
        estimated_e = (double)randVCount/N;
        System.out.println("The estimated value of e is: " + estimated_e);
        System.out.println("The actual value of e is: " + e);
        System.out.println("The absolute difference between the estimated value of e and actual value of e is: " + Math.abs(estimated_e - e));
    }
}
