class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n>1){
            if(answer >= 500){
                return -1;
            }else if(n%2==0){
                n = n/2;
                answer++;
            }else{
                n = n*3+1;
                answer++;
            }
        }
        return answer;
    }
}