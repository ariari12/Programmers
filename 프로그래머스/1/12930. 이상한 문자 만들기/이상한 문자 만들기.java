class Solution {
    public String solution(String s) {        
        String[] array = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++){
            String word = array[i];
            for(int j=0; j<word.length(); j++){
                char c =word.charAt(j);
                if(j%2==0){
                    sb.append(Character.toUpperCase(c));
                }else{
                    sb.append(Character.toLowerCase(c));
                }                
            }
            if(i == array.length-1){
                return sb.toString();
            }else{
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}