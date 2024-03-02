class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count=0;
        count=n/10;
        answer=n*12000+(k-count)*2000;
        return answer;
    }
}