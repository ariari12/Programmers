class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean b=true;
        if(ineq.equals(">")){
            if(eq.equals("=")){
                b=n>=m;
            }else if(eq.equals("!")){
                b=n>m;
            }
            
        }else if(ineq.equals("<")){
            if(eq.equals("=")){
                b=n<=m;
            }else if(eq.equals("!")){
                b=n<m;
            }
        }
        if(b==true){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}