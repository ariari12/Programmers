import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] emergency) {
        Integer[] array = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Comparator.reverseOrder());
        int[] result = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] == array[i]) {
                    result[j] = i + 1;
                    break;
                }
            }
        }
        return result;
    }
}