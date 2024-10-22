import java.util.Scanner;

public class StringToCharArray {
    // Q5: write a java program to convert string to char array
    // without using in build function?  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        char ch[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);
        }
        System.out.print("[");
        for(int i=0;i<str.length();i++){
            if(i!=str.length()-1){
                System.out.print(ch[i]+", "); 
            }else{
                System.out.print(ch[i]); 
            }
            }
        System.out.print("]");
        sc.close();

    }
}
