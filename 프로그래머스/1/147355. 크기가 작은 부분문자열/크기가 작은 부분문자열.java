import java.util.*;
class Solution {
    public int solution(String t, String p) {        
        int count = 0 ; 
        int pLength = p.length();
        List<String> list = new ArrayList<>();
        if(pLength == t.length()){
            return t.length() > pLength ? 0 : 1;
        }
        for (int i = 0; i <= t.length() - pLength; i++) {
            String s = t.substring(i, i + pLength);

            if (Long.parseLong(s) <= Long.parseLong(p)) {
                count++;
            }
        }
        return count;
    }
}