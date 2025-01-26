import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int num=arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(num!=arr[i]){
                list.add(arr[i]);
                num=arr[i];
            }
        }
        
        answer = list.stream().mapToInt(i -> i.intValue()).toArray();

        return answer;
    }
}