import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = count; j > i; j--){
                System.out.printf("*");
            }

            System.out.println();

        }
    }
}