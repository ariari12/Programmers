
import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<>();
        answerList.add(n);              
        while(n!=1){
            if(n%2==0){
                n=n/2;                
            }else{
                n=3*n+1;            
            }
            answerList.add(n);   
        }
        answer = answerList.stream().mapToInt(x -> x.intValue()).toArray();
        return answer;
    }
}