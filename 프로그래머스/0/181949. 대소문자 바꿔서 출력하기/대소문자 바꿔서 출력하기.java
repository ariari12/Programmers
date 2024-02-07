import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        char[] chr = a.toCharArray();
        String str="";
        for(char c : chr){
            if(Character.isUpperCase(c)){
                str += Character.toLowerCase(c);
            }else{
                str += Character.toUpperCase(c);
            }
        }
        System.out.print(str);
    }
}