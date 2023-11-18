#2029. 몫과 나머지 출력하기

T = int(input())
for test_case in range(1, T + 1):
    a, b = map(int, input().split())
    m = int(a/b)
    n = int(a%b)
    print(f'#{test_case} {m} {n}')