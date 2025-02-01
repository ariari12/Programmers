class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int round = 0;
        
        if(s.equals("1")){
            answer[0]=1;
            answer[1]=0;
            return answer;
        }
        while(!s.equals("1")){
            count += s.chars()
                        .filter(c -> c == '0')
                        .count();
            s=s.replace("0","");
                        
            s = Integer.toBinaryString(s.length());  // 길이를 2진수로 변환
            round++;  // 이진 변환 횟수 증가
        }
        answer[0]=round;
        answer[1]=count;
        return answer;
    }
}