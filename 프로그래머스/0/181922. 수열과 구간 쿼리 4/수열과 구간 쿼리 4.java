class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer=new int[arr.length];
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0];
                queries[i][1]>=j; j++
               ){
                if(j%queries[i][2]==0){
                    arr[j]++;
                }
            }
            
        }
        
        
        return answer=arr;
    }
}