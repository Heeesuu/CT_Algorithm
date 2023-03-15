import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();

        char[] num = b.toCharArray();

        for (int i = 0; i < num.length; i++){
          sum += num[i] - '0';

        }
        System.out.println(sum);
    }
}