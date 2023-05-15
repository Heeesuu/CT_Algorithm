import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int a = 0;
        int maxCount = 0;

        for (int i = 1; i <= 9; i++) {
            a = sc.nextInt();
            if (max < a) {
                max = a;
                maxCount = i;
            }
        }

        System.out.println(max);
        System.out.println(maxCount);


    }
}
