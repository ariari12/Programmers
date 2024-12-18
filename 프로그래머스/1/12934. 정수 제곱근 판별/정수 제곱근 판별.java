import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        
        
        if(num > 0 && num == Math.floor(num)){
            answer = (long)((num+1)*(num+1));           
        }else{
         answer=-1;    
        }
        
        return answer;
    }
}