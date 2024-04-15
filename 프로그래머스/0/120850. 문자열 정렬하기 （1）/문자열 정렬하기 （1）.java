import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        String temp= my_string.replaceAll("[a-z]", ""); 
        String[] arr = temp.split("");
        int[] answer = new int[arr.length];
        for(int i=0; i<answer.length; i++){
            answer[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}