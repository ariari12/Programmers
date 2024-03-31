class Solution {
    public String solution(String rsp) {
        String[] result = rsp.split("");
        String answer = "";
        for(String r : result){
            if(r.equals("0")){
                answer+="5";
            }else if(r.equals("5")){
                answer+="2";
            }else{
                answer+="0";
            }
        }
        return answer;
    }
}