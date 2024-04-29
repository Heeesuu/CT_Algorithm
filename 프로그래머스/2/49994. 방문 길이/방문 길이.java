import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String dirs) {
        int answer = 0;

        String[] dirsArr = dirs.split("");
        Set<String> set = new HashSet<>();

        int x = 0, y = 0;

        for (String dir : dirsArr) {
            int nx = x, ny = y;
            switch (dir) {
                case "U":
                    if (y + 1 <= 5) ny++;
                    break;
                case "D":
                    if (y - 1 >= -5) ny--;
                    break;
                case "L":
                    if (x - 1 >= -5) nx--;
                    break;
                case "R":
                    if (x + 1 <= 5) nx++;
                    break;
            }

            if (nx != x || ny != y) {
                String path = "(" + x + "," + y + ")-(" + nx + "," + ny + ")";
                String reversePath = "(" + nx + "," + ny + ")-(" + x + "," + y + ")";
                if (!set.contains(path) && !set.contains(reversePath)) {
                    set.add(path);
                }
                x = nx;
                y = ny;
            }
        }

        answer = set.size();
        return answer;
    }
}
