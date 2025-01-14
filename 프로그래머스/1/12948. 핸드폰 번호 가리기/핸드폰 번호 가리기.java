class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        if(length==4) return phone_number;
        String first = phone_number.substring(0,length-4);
        String second = phone_number.substring(length-4);
        var sb = new StringBuilder();
        for(int i=0; i<first.length(); i++){
            sb.append("*");
        }
        answer=sb.toString()+second;
        return answer;
    }
}