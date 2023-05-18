import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int A[] = new int[a];

        for (int i = 0; i < a; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for (int i = 0; i < a; i++) {
            System.out.println(A[i]);
        }

    }
}
