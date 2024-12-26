class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        long total = 0;
        String[] strNum = String.valueOf(x).split("");
        for(int i=0; i<strNum.length; i++){
            total =total + Integer.parseInt(strNum[i]);
        }
        if(x%total==0){
            return answer;    
        }else{
            return answer = false;
        }
        
        
    }
}