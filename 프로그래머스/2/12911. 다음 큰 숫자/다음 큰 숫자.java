class Solution {
    public int solution(int n) {
        int answer = 0;
        int one = Integer.bitCount(n);
        while(true){
            n++;
            if(one == Integer.bitCount(n)){
                break;
            }
        }
        return n;
    }
}