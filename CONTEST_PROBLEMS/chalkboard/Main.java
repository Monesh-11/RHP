import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>l=new ArrayList<>();
        l.add(sc.nextInt());
        int q=sc.nextInt();
        
        
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ind1 = Collections.binarySearch(l, a);
        if (ind1 < 0) {
            ind1 = -(ind1 + 1);
        }
        l.add(ind1, a);
         int ind2 = Collections.binarySearch(l, b);
        if (ind2 < 0) {
            ind2 = -(ind2 + 1);
        }
        l.add(ind2, b);
            System.out.println(l.get(l.size()/2));
          
        }
    }
}