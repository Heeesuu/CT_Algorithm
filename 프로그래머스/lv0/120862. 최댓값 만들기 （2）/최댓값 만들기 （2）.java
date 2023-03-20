import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int num1 = numbers[numbers.length -1] * numbers[numbers.length - 2];
        int num2 = numbers[0] * numbers[1];
        
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
}
