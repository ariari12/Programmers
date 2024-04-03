class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count =0;
        for(int i=1; i<k; i++){
            count+=2;            
        }
        count=count%numbers.length;
        return numbers[count];
    }
}