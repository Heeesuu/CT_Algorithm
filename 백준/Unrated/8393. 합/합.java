import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();

        for (int i =1; i <= n; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}