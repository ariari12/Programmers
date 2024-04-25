import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] array =String.valueOf(order).split("");
        for (String s : array) {
            for (int i = 3; i <=9; i+=3) {
                if(s.contains(String.valueOf(i))){
                    answer++;
                }
            }
        }
        return answer;
    }
}