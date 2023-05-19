import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int count = sc.nextInt();
        int[] A = new int[count];

        for (int i = 0; i < count; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int []S = new int[count];
        S[0] = A[0];

        int sum = S[0];


        for (int i = 1; i < count; i++) {
            S[i] = S[i - 1] + A[i];
            sum += S[i];
        }
        System.out.println(sum);



    }
}
