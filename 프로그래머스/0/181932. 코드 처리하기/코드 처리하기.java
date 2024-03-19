class Solution {
    public String solution(String code) {
        String answer = "";
        int mode=0;
        char[] charArray = code.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]=='1'){
                mode++;
                continue;
            }
            
            if(mode%2==0 && i%2==0){
                answer=answer+charArray[i];
            }else if(mode%2==1 && i%2==1){
                answer=answer+charArray[i];
            }
        }
        if(answer==""){
            answer="EMPTY";
        }
        return answer;
    }
    

}