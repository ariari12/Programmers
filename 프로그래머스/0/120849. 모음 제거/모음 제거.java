class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] array = {"a","e","i","o","u"};
        for(int i=0; i<array.length; i++){
            answer=answer.replace(array[i],"");
        }
        return answer;
    }
}