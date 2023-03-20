import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() / 4;

        for (int i = 1; i <= a; i++){
            System.out.printf("long ");
        }
        System.out.printf("int");

    }
}