import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] strN = String.valueOf(n).split("");
        Arrays.sort(strN,(a, b) -> Integer.parseInt(b) - Integer.parseInt(a));
        String desc = String.join("",strN);
        answer = Long.parseLong(desc);
        
        
        
        return answer;
    }
}