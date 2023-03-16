import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int a = m - 45;

        if (a == 0){
            System.out.printf(h + " ");
            System.out.printf(String.valueOf(a));
        }

        if (a < 0) {
            if (h == 0) {
                System.out.printf("23 ");
                System.out.printf(String.valueOf(60 + a));
            } else {
                System.out.printf(h - 1 + " ");
                System.out.printf(String.valueOf(60 + a));
            }
        }

        if (a > 0) {
            System.out.printf(h + " ");
            System.out.printf(String.valueOf(a));
        }

    }
}