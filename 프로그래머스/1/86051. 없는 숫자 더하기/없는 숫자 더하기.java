class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int total = 45;
        for(int i=0; i<numbers.length; i++){
            total -= numbers[i];
        }
        return total;
    }
}