class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] cArray=my_string.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            if(cArray[i]>=97){
                answer.append(String.valueOf(cArray[i]).toUpperCase());
            }else{
                answer.append(String.valueOf(cArray[i]).toLowerCase());
            }
        }
        return answer.toString();
    }
}