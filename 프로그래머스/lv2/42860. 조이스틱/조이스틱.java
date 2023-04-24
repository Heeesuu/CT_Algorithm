class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int minMove = len - 1;

        for (int i = 0; i < len; i++) {
            // 알파벳 이동 횟수 계산
            int diff = name.charAt(i) - 'A';
            answer += Math.min(diff, 26 - diff);

            // 다음 문자로 이동하기 위한 조이스틱 조작 횟수 계산
            int nextIndex = i + 1;
            while (nextIndex < len && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }
            int move = i + len - nextIndex + Math.min(i, len - nextIndex);
            minMove = Math.min(minMove, move);
        }

        answer += minMove;
        return answer;
    }
}