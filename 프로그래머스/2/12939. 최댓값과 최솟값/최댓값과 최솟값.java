import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] arrNum = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arrNum[i]+=Integer.parseInt(arr[i]);
        }
        Arrays.sort(arrNum);
        answer += arrNum[0]+" "+arrNum[arr.length-1];
        return answer;
    }
}