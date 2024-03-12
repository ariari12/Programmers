class Solution {
    public int solution(int a, int b) {
        String str = ""+a+b;
        int result1 = Integer.parseInt(str);
        int result2 = 2*a*b;
        int answer = 0;
        if(result1>result2){
            answer = result1;    
        }else{
            answer = result2;
        }
        
        return answer;
    }
}