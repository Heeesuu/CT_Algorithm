class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        int a = 0;
        for (int i =0; i < numlist.length; i++){
            if (numlist[i] % n == 0){
                count++;
            }
        }
        int[] answer = new int[count];
        
        for (int i = 0; i < numlist.length; i++){
            if (numlist[i] % n == 0){
                answer[a] = numlist[i];
                a++;
            }
        }
        return answer;
    }
}
