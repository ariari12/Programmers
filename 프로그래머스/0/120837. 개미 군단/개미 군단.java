class Solution {
    public int solution(int hp) {
        int answer = 0;
        int remainHp=0;
        int general=5;
        int soldier=3;
        int work=1;
        if(hp>=general){
            answer+=hp/general;
            remainHp=hp%general;
            if(remainHp>=soldier){
                answer+=remainHp/soldier;            
                remainHp=remainHp%soldier;
            }        
            answer+=remainHp/work;
        }else if(hp>=soldier){
            answer+=hp/soldier;            
            remainHp=remainHp%soldier;
            answer+=remainHp/work;
        }else{
            answer+=hp;
        }
        return answer;
    }
}