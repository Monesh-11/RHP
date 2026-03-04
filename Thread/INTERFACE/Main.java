import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Thread t1=new Thread(new Worker(1,10));
        Thread t2=new Thread(new Worker(2,10));
        t1.start();
        t2.start();
    }
}