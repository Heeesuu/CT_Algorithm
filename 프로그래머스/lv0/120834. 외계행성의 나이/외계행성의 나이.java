class Solution {
    public String solution(int age) {
        String answer = "";
        String agee = String.valueOf(age);
        
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i =0; i < agee.length(); i++){
            for (int j = 0; j < abc.length; j++)
            if (String.valueOf(j).equals(String.valueOf(agee.charAt(i)))){
                answer += abc[j];
            }

        }
        return answer;
    }
}