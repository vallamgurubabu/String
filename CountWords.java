//import java.util.ArrayList;
import java.util.Scanner;
//mathod-1
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        sc.close();
        System.out.println(words.length);
    }
}
// Method -2
// Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String word = "";
        // ArrayList<String> s = new ArrayList<>();
        // for (int i = 0; i <= str.length(); i++) {
        //     if (i == str.length() || str.charAt(i) == ' ') {
        //         if (!word.isEmpty()) {
        //             s.add(word);
        //             word = ""; 
        //         }
        //     } else {
        //         word += str.charAt(i);
        //     }
        // }
        // sc.close();
        // System.out.println(s.size());

// Method-3
// import java.util.*;

// public class CountNumWords {

// 	public static void main(String[] args) {
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter a String");
// 		String s1=s.nextLine().trim();
// 		int count=0;
// 		for(int i=0;i<s1.length();i++)
// 		{
// 			if(s1.charAt(i)==' '&& s1.charAt(i-1)!=' ')
// 			{
// 				count++;
// 			}
// 		}
// 		if(!s1.isEmpty())
// 		{
// 			System.out.println(count+1);
// 		}
// 		else
// 		{
// 			System.out.println(count);
// 		}
// 		s.close();
// 	}
	
// }
           
