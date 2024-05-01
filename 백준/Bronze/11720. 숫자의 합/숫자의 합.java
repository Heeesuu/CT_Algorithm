import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nNum = sc.next();
        int sum = 0;
        
        char[] charArr = nNum.toCharArray();
        for(int i=0; i<charArr.length; i++){
            sum += charArr[i] - '0';
        }
        
        System.out.println(sum);
    }
}