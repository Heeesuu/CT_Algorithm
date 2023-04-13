class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }

        return answer;
    }
}