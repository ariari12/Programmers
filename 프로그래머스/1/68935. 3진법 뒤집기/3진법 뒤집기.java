import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int num=n;
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%3);
            num=num/3;
        }
        StringBuilder reverse =sb.reverse();
        for(int i=0; i<reverse.length(); i++){
            char c =reverse.charAt(i);
            answer+=Character.getNumericValue(c)*Math.pow(3,i);
        }
        
        return answer;
    }
}