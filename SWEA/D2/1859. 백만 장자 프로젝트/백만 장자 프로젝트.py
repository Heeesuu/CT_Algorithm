#1859. 백만 장자 프로젝트
#나도 그 능력 갖고싶다....


T = int(input())
for test_case in range(1, T + 1):
    a = int(input())
    num = list(map(int, input().split()))

    max_cost = num[-1]
    all_cost = 0

    for i in range(a-2, -1, -1):
        if num[i] > max_cost:
            max_cost = num[i]
        else:
            all_cost += max_cost - num[i]

    print(f'#{test_case} {all_cost}')