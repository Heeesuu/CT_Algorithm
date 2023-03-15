import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = 0;
        double sum = 0;
        int[] num = new int[sc.nextInt()];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxNum){
                maxNum = num[i];
            } else {
                maxNum = maxNum;
            }
            sum += num[i];
        }
        System.out.println(sum * 100 / maxNum / num.length);
    }
}