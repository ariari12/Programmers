import java.util.*;
class Solution {
    public int[] solution(int[] arr) {        
        if(arr.length == 1) return new int[] {-1};
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int count = 0;
        for(int a : arr){
            min = a<min ? a : min;
        }
        for(int i=0; i<arr.length; i++){
            if(min != arr[i]){
                answer[count++] = arr[i];
            } 
            
        }
        
        return answer;
    }
}