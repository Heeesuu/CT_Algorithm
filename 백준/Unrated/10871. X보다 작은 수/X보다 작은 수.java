import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int[] numList = new int[sc.nextInt()];
        int maxNum = sc.nextInt();

        for (int i =0; i < numList.length; i++){
           numList[i] = sc.nextInt();
           if (numList[i] < maxNum) {
               count++;
           }
        }
        int[] countList = new int[count];
        int j = 0;
        for (int i = 0; i < numList.length; i++){
            if (numList[i] < maxNum) {
                countList[j] = numList[i];
                j++;
                }
            }

        for(int i = 0; i < countList.length; i++) {
            System.out.printf(countList[i] + " ");
        }
    }
    }