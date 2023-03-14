class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowels = {"a", "e", "o", "u", "i"};
        for (int i = 0; i < vowels.length; i++){
            if (my_string.contains(vowels[i])){
                answer = my_string.replaceAll(vowels[i], "");
                my_string = answer;
            } else {
                answer = my_string;
            }
        }
        return answer;
    }
}
