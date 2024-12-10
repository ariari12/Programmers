class Solution {
    public int[] solution(long n) {        
        String str =String.valueOf(n);
        String[] arrayStr = str.split("");
        int[] answer = new int[arrayStr.length];
        int cnt=0;
        for(int i=arrayStr.length-1; i>=0; i--){
            answer[cnt] = Integer.parseInt(arrayStr[i]);
            cnt++;
        }
        return answer;
    }
}