import java.io.*;
public class Question1 {
    private String [] queueA;
    private int front, rear, numItems,maxSize;

    public static void main(String [] args) throws IOException{
        QueueReader test = new QueueReader();
        String [] input = test.array(); // importing array with file in from QueueReader
        Question1 queue = new Question1(100);
        String fileToWrite = "Answers";
        FileWriter write = new FileWriter(fileToWrite);
        BufferedWriter bw = new BufferedWriter(write);

        for (int i = 0; i < input.length; i++) {
            if (input[i].contains("INSERT")) {
                String insertCom = String.valueOf(queue.insert(input[i].substring(7)));
                System.out.println(insertCom);
                bw.write(insertCom+ "\n");
            }else {
                String outputCom = queue.remove();
                System.out.println(outputCom);
                bw.write(outputCom + "\n");
            }
        }
        bw.close();
    }

    public Question1(int s){ //creation of the queue
        maxSize = s;
        queueA = new String [maxSize];
        front = 0;
        rear = -1;
        numItems = 0; // number of items in queue (0 as the queue is being created)
    }

    public boolean insert(String n){
        if(Full() == true){
            return false;
        }
        if(rear == maxSize - 1){
            rear = -1; // wraps array around
        }
        rear++;
        queueA[rear] = n;
        numItems++;
        return true;
    }

    public String remove(){
        if(Empty() == true){
            return "EMPTY";
        }
        else{
            String temp = queueA[front];
            front++;
            if(front == maxSize){
                front = 0;
            }
            numItems--;
            return temp;
        }
    }

    public String peek(){
        return queueA[front];
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
}
