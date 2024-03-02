class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i]=i+1;
            if(num[i]%2==0){
                answer+=num[i];
            }
        }
    
        return answer;
    }
}