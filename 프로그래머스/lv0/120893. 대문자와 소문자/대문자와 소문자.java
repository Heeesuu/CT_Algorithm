class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arrays = my_string.toCharArray();
        
        String a = "";
        for (int i = 0; i <arrays.length; i++){
            if (arrays[i] >= 97 && arrays[i] <= 122){
                a = arrays[i] + ""; //아스키코드를 다시 스트링으로 변환
                answer += a.toUpperCase();
            } else if (arrays[i] >= 65 && arrays[i] <= 90){
                a = arrays[i] + "";
                answer += a.toLowerCase();
            }
        }
        return answer;
    }
}