import java.util.*;
public class Monte_Carlo_Pi {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the number of random points to be generated:");
        int N = sc.nextInt(),randVCount = 0,totalPoints;
        double x,y,estimatedPi,pi;

        for(int i = 0;i < N /* *N */ ; i++){
            x = rand.nextDouble(-1,1);
            y = rand.nextDouble(-1,1);
            double inCircle = (x*x) + (y*y);
            if(inCircle <= 1){
                randVCount++;
            }
           /*  totalPoints++ */
        }
        estimatedPi = 4 *((double)randVCount/(double)N /* *N totalPoints */);
        pi = Math.PI;
        System.out.println("The estimated value of Pi using " + N + " random points is: " + estimatedPi);
        System.out.println("The actual value of Pi is: " + pi);
        System.out.println("The absolute difference between the estimated value of Pi and the actual value of Pi is: " + Math.abs((double)(estimatedPi-pi)));
    }
}
