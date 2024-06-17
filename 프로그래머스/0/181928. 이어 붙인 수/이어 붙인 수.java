class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String temp1="";
        String temp2="";
        for(int n: num_list){
            if(n%2==0){
                temp1=temp1+n;
            }else if(n%2==1){
                temp2=temp2+n;
            }        
        }
        answer=Integer.parseInt(temp1)+Integer.parseInt(temp2);
        return answer;
    }
}