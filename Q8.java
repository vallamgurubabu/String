import java.util.HashMap;
import java.util.Scanner;


public class Q8 {
    //Q8: input: “AssmnAN” output: A=2, s=2, m=1, n=1, N=1?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hc = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hc.put(str.charAt(i),hc.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(char ch:hc.keySet()){
            System.out.print(ch+"==>"+hc.get(ch));
        }
        sc.close();
        
    }
}
