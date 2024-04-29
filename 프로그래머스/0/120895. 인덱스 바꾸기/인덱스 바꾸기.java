class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        String n1=str[num1];
        String n2=str[num2];
        for(int i=0; i<str.length; i++){
            if(i==num1){
                str[i]=n2;
            }else if(i==num2){
                str[i]=n1;
            }
            answer+=str[i];
        }
        
        return answer;
    }
}