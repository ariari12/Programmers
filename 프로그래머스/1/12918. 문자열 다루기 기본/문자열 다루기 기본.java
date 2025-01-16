class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int length = s.length();
        if(length==4 || length==6){
            var num =new StringBuilder();            
            for(char c : s.toCharArray()){
                if(!Character.isDigit(c)){
                    return answer;
                }
            }
            return true;
        }
        return answer;
    }
}