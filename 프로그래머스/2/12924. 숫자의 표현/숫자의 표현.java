class Solution {
    public int solution(int n) {        
        int count = 0;
        int sum;
        for(int num = 1; num<=n; num++){
            sum = 0;
            for(int number=num; sum<=n; number++){
                sum+=number;
                if(sum==n){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}