import java.util.Scanner;

public class SumOfNumbers {
//     Q6: write a java program to print sum of number present in a
// string? Input:” ash123” output: 6
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    int sum=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)>=48 && str.charAt(i)<=57){
            sum+=Integer.parseInt(str.charAt(i)+"");
        }
    }
    sc.close();
    System.out.println(sum);
 }
}
