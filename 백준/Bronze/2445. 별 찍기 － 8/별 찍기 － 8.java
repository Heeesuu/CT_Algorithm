import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 위쪽 삼각형
        for (int i = 0; i < n; i++) {
            // 왼쪽 별 찍기
            for (int j = 0; j < i+1; j++) {
                sb.append("*");
            }
            // 가운데 공백 찍기
            for (int j = 0; j < 2*(n-i-1); j++) {
                sb.append(" ");
            }
            // 오른쪽 별 찍기
            for (int j = 0; j < i+1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        // 아래쪽 삼각형
        for (int i = n-2; i >= 0; i--) {
            // 왼쪽 별 찍기
            for (int j = 0; j < i+1; j++) {
                sb.append("*");
            }
            // 가운데 공백 찍기
            for (int j = 0; j < 2*(n-i-1); j++) {
                sb.append(" ");
            }
            // 오른쪽 별 찍기
            for (int j = 0; j < i+1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}