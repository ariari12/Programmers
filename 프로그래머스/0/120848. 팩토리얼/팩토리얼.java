class Solution {
    public int solution(int n) {
        int answer = 0;
        long count=1;
        for(int i=1; i<=n; i++){
            count*=i;
            if(count>n){
                return answer=i-1;        
            }else if(count==n){
                return answer=i;
            }
        }
        return answer;
    }
}