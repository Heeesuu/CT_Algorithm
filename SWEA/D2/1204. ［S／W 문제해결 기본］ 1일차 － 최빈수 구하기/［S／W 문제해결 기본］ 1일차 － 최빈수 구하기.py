#1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
#빈수야 팥빈수야


T = int(input())
for test_case in range(1, T + 1):
    a = int(input())
    num = list(map(int, input().split()))
    num.sort()

    first = num[0]
    count = 0
    max_count = 0

    for i in range(1000):
        if num[i] == first:
            count += 1

        elif num[i] != first:
            if count >= max_count:
                max_count = count
                idx = i - 1
            count = 1
        first = num[i]

    print(f'#{test_case} {num[idx]}')


