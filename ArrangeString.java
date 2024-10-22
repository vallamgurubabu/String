import java.util.Scanner;

public class ArrangeString {
    // Q2: write a java program to arrange a character in a string?
    // Input:” ram#123” output:”123#ram” 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String num = "";
        String special ="";
        String alpha ="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                alpha+=str.charAt(i);
            }else if(str.charAt(i)>=48&&str.charAt(i)<=57){
                num+=str.charAt(i);
            }else{
                special+=str.charAt(i);
            }
        }
        System.out.println(num+special+alpha);
        sc.close();

    }
}
