import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int star = 1;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 1; j <= n - star; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= star; k++) {
                sb.append("*");
            }
            if (i > n -2){
                sb.append("\n");
                star--;
            } else {
                sb.append("\n");
                star++;
            }

        }
        System.out.print(sb);
    }
}