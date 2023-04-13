class Solution {
    public int solution(int num, int k) {
        String answerStr = Integer.toString(num);
        int[] answerList = new int[(answerStr.length())];

        for (int i = 0; i < answerList.length; i++){
            answerList[i] = answerStr.charAt(i) -'0';
            
            if (answerList[i] == k) {
                return i + 1;
            }
        }
        
        return -1;
    }
}

