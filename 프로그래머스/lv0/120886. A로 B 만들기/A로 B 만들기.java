import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();

        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        String beforeString = new String(beforeChar);
        String afterString = new String(afterChar);
        
        if (beforeString.equals(afterString)) {
            return 1;
        } else {
            return 0;
        }
        
    }
}