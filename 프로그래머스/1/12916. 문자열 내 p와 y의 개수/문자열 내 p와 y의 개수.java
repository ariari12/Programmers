class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount=0;
        int yCount=0;
        String[] split = s.split("");
        for (String string : split) {
            if(string.equals("p")||string.equals("P")){
                pCount++;
            }else if(string.equals("y")||string.equals("Y")){
                yCount++;
            }
        }
        if(pCount == yCount){
            answer=true;
            return answer;
        } else {
            return answer;
        }
    }
}