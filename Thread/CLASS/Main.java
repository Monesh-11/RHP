import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Worker w1=new Worker(1,10);
        Worker w2=new Worker(2,10);
        w1.start();
        w2.start();

    }
}