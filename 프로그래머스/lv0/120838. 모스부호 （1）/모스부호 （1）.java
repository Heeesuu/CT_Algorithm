class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] t = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] morse = letter.split(" ");

        for (String s : morse) {
            for (int i = 0; i < t.length; i++) {
                if (s.equals(t[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }



        return answer;
    }
}