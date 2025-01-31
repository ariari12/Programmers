import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n,m);
        long lcm = (long) n * m / gcd; 
        answer[0]=gcd;
        answer[1]=(int)lcm;
        
        return answer;
    }
    
    public int gcd(int n,int m){
        int temp=0;
        while(n != 0){
            temp=n;
            n = m%n;
            m = temp;
        }
        return temp;
    }
}