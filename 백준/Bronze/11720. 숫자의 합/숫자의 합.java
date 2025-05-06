import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        String N2 = sc.next();
        int sum = 0;

        char[] charArray = N2.toCharArray();
        for(int i=0; i<=charArray.length-1; i++) {
            sum += charArray[i] - '0';
        }
        System.out.println(sum);
    }
}