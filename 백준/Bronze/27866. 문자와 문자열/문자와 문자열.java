import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int a = Integer.parseInt(br.readLine());
        String[] wordd = word.split("");

        System.out.println(wordd[a - 1]);


    }
}

