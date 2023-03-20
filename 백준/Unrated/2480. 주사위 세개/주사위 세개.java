import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int answer = 0;

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a != b && b != c && a != c) {
            if (a > b && a > c) {
                answer = a * 100;
                System.out.println(answer);
            } else if (b > a && b > c) {
                answer = b * 100;
                System.out.println(answer);
                
            } else {
                answer = c * 100;
                System.out.println(answer);
            }
        } else if (a == b && b == c) {
            answer = (a * 1000) + 10000;
            System.out.println(answer);
            
        } else if (a == b || b == c) {
            answer = (b * 100) + 1000;
            System.out.println(answer);
            
        } else if (a == c || c == b) {
            answer = (c * 100) + 1000;
            System.out.println(answer);
        }
    }
}
