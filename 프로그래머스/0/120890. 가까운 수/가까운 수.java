import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp =100;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(temp>Math.abs(n-array[i])){
                temp=Math.abs(n-array[i]);
                answer=i;
            }
            
        }
        
        return array[answer];
    }
}