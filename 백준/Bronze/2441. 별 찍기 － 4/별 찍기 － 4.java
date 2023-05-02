import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = 0;
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            for (int k = star; k < count; k++) {
                System.out.print("*");
                if (k == count - 1) {
                    System.out.print("\n");
                }

            }
            star++;
        }
    }
}