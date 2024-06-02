

T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    a = [[0 for _ in range(N)] for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if i == 0:
                a[0][0] = 1
            if (j-1 <= -1):
                a[i][j] = 0 + a[i-1][j]
            else:
                a[i][j] = a[i-1][j-1] + a[i-1][j]
    print(f"#{test_case}")
    for r in a:
        for e in r:
            if e != 0:
                print(e, end=' ')
        print()
	
