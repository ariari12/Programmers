import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String sN = sc.nextLine();

        String[] cN = sN.split(" ");
        int max = 0;
        long sum = 0;

        for(String c : cN){
            int num = Integer.parseInt(c);
            if(max<num){
                max = num;
            }
            sum += num;
        }
        double average = (double) (sum * 100) / max / N;
        System.out.println(average);
    }
}