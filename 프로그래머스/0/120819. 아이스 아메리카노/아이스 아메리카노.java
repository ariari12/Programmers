class Solution {
    public int[] solution(int money) {
        int[] answer=new int[2];
        int count;
        int bal;
        count=money/5500;
        bal =money%5500;
        answer[0]=count;
        answer[1]=bal;
        return answer;
    }
}