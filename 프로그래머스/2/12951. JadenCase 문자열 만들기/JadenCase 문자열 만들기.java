class Solution {
    public String solution(String s) { 
        String[] arr = s.split(" ", -1); // 연속된 공백 유지
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                String word = arr[i];

                if (Character.isDigit(word.charAt(0))) {
                    answer.append(word.toLowerCase());
                } else {

                    answer.append(word.substring(0, 1).toUpperCase())
                          .append(word.substring(1).toLowerCase());
                }
            }


            if (i < arr.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}