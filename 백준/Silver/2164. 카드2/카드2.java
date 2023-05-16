import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> Q = new LinkedList<>();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            Q.add(i);
        }
        
        while (Q.size() > 1) {
            Q.poll();
            Q.add(Q.poll());
        }

        System.out.println(Q.poll());


    }
}
