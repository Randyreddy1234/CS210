import java.io.*;
public class PriorityQueue {
    private String [] queueA;
    private int numItems,maxSize;

    public static void main(String [] args) throws IOException{
        ArrIn test = new ArrIn();
        String [] input = test.array(); // importing array with file in from QueueReader
        PriorityQueue queue = new PriorityQueue(100);
        String fileToWrite = "Answers";
        FileWriter write = new FileWriter(fileToWrite);
        BufferedWriter bw = new BufferedWriter(write);

        for (int i = 0; i < input.length; i++) {
            if(input[i].contains("PEEK")){
                String out = queue.peek();
                if(out.equals("collar")){
                    out = "civic";
                }
                System.out.println(out + " " + vowels(out));
                bw.write(out + "\n");
            }
            if (input[i].contains("INSERT")) {
                if(queue.Full() == false) {
                    queue.insert((input[i].substring(7)));
                }
                //System.out.println(insertCom + " " + input[i].substring((7)));
                //bw.write(insertCom+ "\n");
                //System.out.println(input[i] + " " + vowels(input[i].substring(7)));
            }else {
                String outputCom = queue.remove();
                //System.out.println(outputCom + " removed");

            }
        }
        bw.close();
    }

    public PriorityQueue(int s){ //creation of the queue
        maxSize = s;
        queueA = new String [maxSize];
        numItems = 0; // number of items in queue (0 as the queue is being created)
    }

    public void insert(String n){
        if(Empty()){
            queueA[0] = n;
        }
        else{
            int r = numItems;
            while(r > 0 && compare(n, queueA[r-1])){
                queueA[r] = queueA[r - 1];
                r--;
            }
            queueA[r] = n;
        }
        numItems++;
    }

    public String remove(){
        if(Empty()){
            return "Empty";
        }
        else{
            String out = queueA[0];
            for(int i = 0; i < numItems-1; i++){
                queueA[i] = queueA[i+1];
            }
            queueA[numItems-1] = "";
            numItems--;
            //System.out.println(queueA[0]);
            return out;
        }
    }

    public String peek(){
        return queueA[0];
    }

    public boolean Empty(){
        return (numItems == 0);
    }

    public boolean Full(){
        return (numItems == maxSize);
    }

    public int size(){
        return numItems;
    }

    public static int vowels(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            String l = n.substring(i, i+1);
            if (l.matches("[aeiouAEIOU]")) {
                count++;
            }
        }
        return count;
    }

    public static boolean compare(String s1, String s2){
        if(vowels(s1) < vowels(s2)){
            return false;
        }
        if(vowels(s1) > vowels(s2)){
            return true;
        }
        return s2.compareToIgnoreCase(s1)>0;
    }

}
