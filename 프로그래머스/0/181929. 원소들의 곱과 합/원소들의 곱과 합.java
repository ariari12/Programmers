class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum=0;
        int mult=1;
        for(int n : num_list){
            sum+=n;
        }
        for(int n : num_list){
            mult*=n;
        }
        if(mult<Math.pow(sum,2)){
            answer=1;
        }else if(mult>Math.pow(sum,2)){
            answer=0;
        }
        return answer;
    }
}