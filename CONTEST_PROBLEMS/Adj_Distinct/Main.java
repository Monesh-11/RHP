// import java.util.*;
// import java.util.stream.Collectors;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int q=sc.nextInt();

//         while(q-->0){
//         HashMap<Character,Integer>map=new HashMap<>();
//         String s=sc.next();
//         for(char c:s.toCharArray()){
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         Map<Character, Integer> sortedMap = map.entrySet()
//             .stream()
//             .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
//             .collect(Collectors.toMap(
//                 Map.Entry::getKey,
//                 Map.Entry::getValue,
//                 (oldValue, newValue) -> oldValue, 
//                 LinkedHashMap::new
//             ));
//             int max=-1;
//             for(Character k:sortedMap.keySet()){
//                 max=sortedMap.get(k);
//                 break;
//             }
//          //   System.out.println(sortedMap+" "+max);
//             int bal=s.length()-max;
//             if(Math.abs(max-bal)>1)
//             {
//             System.out.println("NO");
//             continue;
//             }
//             System.out.println("YES");
//             pr(sortedMap);
//     }
// }
// // public static void pr(Map<Character,Integer>m){
// //     while(!m.isEmpty()){
// //         for(char k:m.keySet()){
// //             System.out.print(k);
// //             m.put(k,m.get(k)-1);
// //             if(m.get(k)==0){
// //                 m.remove(k);
// //             }
// //         }
// //     }
// //     System.out.println();
// // }
// public static void pr(Map<Character, Integer> m) {
//     // Keep looping until the total string length is exhausted
//     boolean charactersLeft = true;
    
//     while (charactersLeft) {
//         charactersLeft = false;
        
//         // Loop over a static array copy of the keys so map modifications don't crash it
//         for (char k : new ArrayList<>(m.keySet())) {
//             int count = m.getOrDefault(k, 0);
            
//             if (count > 0) {
//                 System.out.print(k);
//                 m.put(k, count - 1);
//                 charactersLeft = true; // We printed something, so we might need another round
//             }
//         }
//     }
//     System.out.println();
// }
// }
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int q = sc.nextInt();

        while (q-- > 0) {
            String s = sc.next();
            int n = s.length();
            
          
            int[] freq = new int[26]; 
            int maxFreq = 0;
            char maxChar = ' ';

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                freq[c - 'a']++;
                if (freq[c - 'a'] > maxFreq) {
                    maxFreq = freq[c - 'a'];
                    maxChar = c;
                }
            }

            int bal = n - maxFreq;
            if (maxFreq - bal > 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

         
            char[] res = new char[n];
            int idx = 0;

    
            while (freq[maxChar - 'a'] > 0) {
                res[idx] = maxChar;
                idx += 2;
                freq[maxChar - 'a']--;
            }

            for (int i = 0; i < 26; i++) {
                while (freq[i] > 0) {
                    if (idx >= n) {
                        idx = 1; 
                    }
                    res[idx] = (char) (i + 'a');
                    idx += 2;
                    freq[i]--;
                }
            }

            System.out.println(String.valueOf(res));
        }
        sc.close();
    }
}