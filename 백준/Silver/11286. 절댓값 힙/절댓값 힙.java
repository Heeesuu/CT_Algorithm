import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> Q = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            
            if(first == second)
                return o1 > o2 ? 1 : -1;
            else
                return first - second;
        });
        
        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            
            if (request == 0) {
                if(Q.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(Q.poll());
                }
            } else {
                Q.add(request);
            }
        }
    }
  }