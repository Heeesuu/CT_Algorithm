import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) { // 높이
            for(int j=1; j<=i; j++) { // 너비
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}