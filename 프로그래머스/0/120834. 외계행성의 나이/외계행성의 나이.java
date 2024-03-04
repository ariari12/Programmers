class Solution {
    public String solution(int age) {
        String answer = age+"";
        String result="";
        char[] charArray = answer.toCharArray();
        for (char c : charArray) {
            result += (char)(c+49);
        }

        return result;
    }
}