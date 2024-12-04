class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int cnt=1;
        while(cnt<=n){
            answer[cnt-1] = (long) cnt*x;
            cnt++;
        }
        return answer;
    }
}