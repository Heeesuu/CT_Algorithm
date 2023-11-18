import math

T = int(input())
for test_case in range(1, T + 1):
    num = list(map(int, input().split()))
    avg = 0
    for i in num:
        avg += i
    avg = round(avg / len(num))
    print(f'#{test_case} {avg}')