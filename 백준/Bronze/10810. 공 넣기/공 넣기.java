import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int[] A = new int[count];

        Arrays.fill(A, 0);

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for (int j = a; j <= b; j++) {
                A[j-1] = c;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(A[i] + " ");
        }

        br.close();


    }
}