import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int sqrt=(int)Math.sqrt(n);
        for(int i=1; i<=sqrt; i++){
            if(n%i==0){
                answer.add(i);
                if(n/i!=i){
                    answer.add(n/i);
                }
            }            
        }
        int[] result=answer.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);
        
        return result;
    }
}