class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String str1=my_string.substring(0,s);
        String str3=my_string.substring(overwrite_string.length()+s,my_string.length());
        return str1+overwrite_string+str3;
        
    }
}