import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int bs=N; // 왼쪽 별의 자릿수를 위한 변수 -> N으로 초기화
        int ls=2; // 오른쪽 별의 자릿수를 위한 변수
        String star="*";
        String fstar=star;

        if(N==1) {//Base case
        	System.out.println("*");
        	return;
        }
        System.out.println(String.format("%"+(bs--)+"s", star)); //일단 하나 출력
        //왼쪽 별의 자릿수 하나 감소 
        for(int i=0; i<N-2; i++)
        {
        	System.out.println(String.format("%"+(bs--)+"s", star)+String.format("%"+(ls)+"s", star));
        	ls+=2;//오른쪽 별의 자릿수 +2    
        	fstar+="**";//맨 마지막 별 출력을 위해 별 갯수 누적 
        }
        System.out.println(fstar+"**");//누적된 별의 수 + ** -
       
    }
} 