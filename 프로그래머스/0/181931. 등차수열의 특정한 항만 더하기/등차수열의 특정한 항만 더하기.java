class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] numbers = new int[included.length];
        numbers[0]=a;
        for(int i=1; i<numbers.length; i++){
            numbers[i]=numbers[i-1]+d;
            if(included[i]==true){
                answer += numbers[i];
            }
            
            
            
            
        }
        return included[0]==true? answer+numbers[0]:answer;
    }
}