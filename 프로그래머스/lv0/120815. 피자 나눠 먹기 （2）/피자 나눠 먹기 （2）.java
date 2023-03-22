class Solution {
    public int solution(int n) {
        int pizza = 6;
        int answer = 0;
        while (true){
            if (pizza % n == 0){
                answer = pizza / 6;
                break;
            } else {
                pizza = pizza + 6;
            }

        }

        return answer;
    }
}

