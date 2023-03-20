import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {

        int index = 0;

        int[] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);

        for (int i = 0; i < array.length; i++) {
            if (array2[array2.length - 1] == array[i]) {
                index = i;
            }
        }

        int[] answer = new int[]{array2[array2.length - 1], index};
        return answer;
    }
}
