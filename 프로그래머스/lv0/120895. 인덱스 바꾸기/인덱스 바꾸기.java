class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] myString = my_string.toCharArray();
        
        myString[num1] = my_string.charAt(num2);
        myString[num2] = my_string.charAt(num1);
        
        answer = String.valueOf(myString);


        return answer;
    }
}