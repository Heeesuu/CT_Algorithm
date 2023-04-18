import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static class Point {
        public final long x, y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    //1-A 교점 좌표 구하기
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {

        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long)x, (long)y);
    }

    //2. 지정된 정수들에 대해 x,y의 최댓값 구하기
    private Point getMinimumPoint(List<Point> points){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        return new Point(x, y);
    }

    private Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        return new Point(x, y);
    }


    public String[] solution(int[][] line) {

        //1. 모든 직선에 대해 반복해서 교점 구하기
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < line.length; i++){
            for (int j = i + 1; j < line.length; j++) {
                //1-B 정수 좌표만 저장. 1번 2번 , 1번 3번, 1번 4번, 2번 3번, 2번 4번 ... 좌표 비교
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                //null이 아닐때 = 정수일때 > 저장
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        //3. 최솟값 최댓값을 이용하여 2차원 배열의 크기 결정
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        //배열크기이므로 + 1을 해준다.
        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        //문자열 넣을 배열이기 때문에 char 자료형선언
        char[][] arr = new char[height][width];
        for (char[] row : arr){
            Arrays.fill(row, '.');
        }

        //4. 2차원 배열에 별 표시
        for (Point p : points) {
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }

        //5. 문자열 배열로 변환 후 저장
        String[] answer = new String[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }

        return answer;
    }

}