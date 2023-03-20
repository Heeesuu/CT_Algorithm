import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;        
        int leng = sc.nextInt();
        
        for (int i = 1; i <= leng; i++){
            answer = (sc.nextInt() + sc.nextInt());
            System.out.println(answer);
        }
    }
}