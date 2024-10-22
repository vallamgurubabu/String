import java.util.Scanner;

public class Palindrome {
//     Q4: write a java program to find given string is palindrome or
// not? 
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = sc.nextLine();
    int i=0;
    int j=str.length()-1;
    str=str.toLowerCase();
    boolean flag =true;
    while(i<=j){
        if(str.charAt(i)!=str.charAt(j)){
           System.out.println("Not a Palindrome");
           flag=false;
           break;
        }
        i++;
        j--;
    }
    if(flag){
        System.out.println("It is a palindrome");
    }
    sc.close();
}
}
