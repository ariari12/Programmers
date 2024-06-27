class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int temp=0;
        for(int i=0; i<queries.length; i++){
            for(int j=1; j<queries[i].length; j++){                
                temp=arr[queries[i][j]];
                arr[queries[i][j]]=arr[queries[i][j-1]];
                arr[queries[i][j-1]]=temp;                                                    
            }
        }
        return answer=arr;
    }
}