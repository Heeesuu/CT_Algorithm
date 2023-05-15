import java.io.*;
import java.util.*;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<Node> md = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!md.isEmpty() && md.getLast().value > now) {
                md.removeLast();
            }
            md.addLast(new Node(now, i));
            if (md.getFirst().index <= i - L) {
                md.removeFirst();
            }
            bw.write(md.getFirst().value + " ");
        }

        bw.flush();
        bw.close();

    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

    }
}