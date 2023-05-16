

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String> s = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            s = new ArrayList<>(Arrays.asList(br.readLine().split("")));

            System.out.print(s.get(0));

            Collections.reverse(s);

            System.out.print(s.get(0) + "\n");


        }


    }
}