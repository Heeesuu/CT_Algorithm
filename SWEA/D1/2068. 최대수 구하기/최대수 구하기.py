T = int(input())
for test_case in range(1, T + 1):
    num = list(map(int, input().split()))
    max_num = max(num)
    print(f'#{test_case} {max_num}')