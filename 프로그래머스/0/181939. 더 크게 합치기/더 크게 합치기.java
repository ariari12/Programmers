class Solution {
    public int solution(int a, int b) {
        int answer=0;
        String str1=""+a+b;
        String str2=""+b+a;
        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);
        
        if(x>y){
            answer = x;
        }else{
            answer = y;
        }
        
        
        return answer;
    }
}