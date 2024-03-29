class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] str =letter.split(" ");
        for(String s : str){
            for(int j=0; j<morse.length; j++){
                if(s.equals(morse[j])){
                    answer+=(char)(j+97);
                }
            }
        }
        
        return answer;
    }
}