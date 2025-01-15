class Solution {
    public String solution(String s) {
        String answer = "";
        int value = s.length()/2;
        if(s.length()%2==0){            
            return s.substring(value-1,value+1);
        }
        
        return Character.toString(s.charAt(value));
    }
}