import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        List<Integer> temp =new ArrayList<>();
        if(direction.equals("right")){
            for(int i=0; i<answer.length; i++){
                if(i==answer.length-1){
                    temp.add(0,numbers[i]);
                }else{
                    temp.add(numbers[i]);
                }
                
            }
        }else if(direction.equals("left")){
            for(int i=1; i<answer.length; i++){                
                temp.add(numbers[i]);
                if(i==answer.length-1){
                    temp.add(numbers[0]);
                }                
            }        
        }
        for(int i=0; i<answer.length; i++){
            answer[i]=temp.get(i);
        }
        
        return answer;
    }
}