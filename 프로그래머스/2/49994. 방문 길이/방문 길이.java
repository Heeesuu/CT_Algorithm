import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        int answer = 0;

        String[] dirsArr = dirs.split("");
		Set<String> set = new HashSet<String>();
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < dirsArr.length; i++) {
            int tempX = x;
            int tempY = y;
			switch (dirsArr[i]) {
			case "U":
				if(y+1 <= 5) y++;
				break;
			case "D":
				if(y-1 >= -5) y--;
				break;
			case "L":
				if(x-1 >= -5) x--;
				break;
			case "R":
				if(x+1 <= 5) x++;
				break;
			}

            String key = "(" + tempX + "," + tempY + ")(" + x + "," + y + ")";       
            String reverseKey = "(" + x + "," + y + ")(" + tempX + "," + tempY + ")";
            if (!key.equals(reverseKey)) { 
                set.add(key);
                set.add(reverseKey);
            }
        }
		
		answer = set.size()/2;
        return answer;
	}
}