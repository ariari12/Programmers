import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
		List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
		Collections.reverse(list);
	
		for (int i = 0; i < answer.length; i++) {
			answer[i]=list.get(i);
		}
        
        return answer;
    }
}