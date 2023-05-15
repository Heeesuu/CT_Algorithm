import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bucket = new int[n+1];

        for (int k = 0; k <= n; k++)
            bucket[k] = k;

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            while(a < b){
                int temp = bucket[b];
                bucket[b] = bucket[a];
                bucket[a] = temp;
                a++;
                b--;
            }
        }
        for (int i = 1; i <= n; i++)
            System.out.print(bucket[i] + " ");
    }
}
