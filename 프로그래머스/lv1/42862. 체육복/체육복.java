
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        //번호 순서대로 순회할 수 있도록 배열을 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);


        //스트림을 이용하여 lost와 reserve를 중복없이 Set변수에 담고 둘의 교집합을 구한다.
        Set<Integer> owns = Arrays.stream(lost)
                .boxed()
                .collect(Collectors.toSet());
        owns.retainAll(Arrays.stream(reserve)
                .boxed()
                .collect(Collectors.toSet()));

        //l에 저장된 lost값을 큐에 저장한다.
        Queue<Integer> q = new LinkedList<>();
        for (int l : lost) q.add(l);


        //reserve를 돌면서 만약 여분의 체육복이 있는 사람인 동시에 잃어버린 사람(owns)이 reserve에 포함되어있다면
        //continue -> 왜냐면 빌려줄 수 있는 사람이 몇 명인지 세기 위해
        int get = 0;
        for (int r : reserve) {
            if (owns.contains(r)) {
                continue;
            }
            //add() 또는 offer(): 큐의 뒤쪽에 요소를 추가합니다.
            //remove() 또는 poll(): 큐의 앞쪽에 있는 요소를 제거하고 반환합니다.
            //peek(): 큐의 앞쪽에 있는 요소를 반환하지만 제거하지는 않습니다.

            //큐는 empty가 아닌지 꼭 확인해야함
            //lost에 들어있는 사람이 r-1값보다작거나(<) owns에 포함되어있을땐 poll으로 큐에서 빼버린다.
            while (!q.isEmpty() && (q.peek() < r - 1 || owns.contains(q.peek()))) {
                q.poll();
            }

            //empty는 더이상 체육복이 필요한 학생이 없다 > 종료
            if (q.isEmpty()) break;


            //조건에 맞지 않은 값은 모두 빠진 상태 , 자동으로 앞쪽에 위치한 원소부터 빠져나간다. -> 가장 작은수부터
            if (q.peek() <= r + 1) {
                q.poll();
                get++;
            }
        }

        return n - lost.length + owns.size() + get;
    }
}