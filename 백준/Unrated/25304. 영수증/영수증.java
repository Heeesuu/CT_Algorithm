import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int Allsum = sc.nextInt();
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            sum += (sc.nextInt() * sc.nextInt());
        }
        
        if (sum == Allsum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

}
}