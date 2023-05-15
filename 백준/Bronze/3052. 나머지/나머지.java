import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A[] = new int[10];
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int a = 0;
        
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++){
            a = A[i] % 42;
            if (!list.contains(a)) {
                list.add(a);
            }
        }

        System.out.println(list.size());
        

    }
}