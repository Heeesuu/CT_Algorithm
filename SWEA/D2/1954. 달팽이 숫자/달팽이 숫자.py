#1954. 달팽이 숫자
#달팽이를 왜 숫자로 세야하냐고

T = int(input())
dx = [0, 1, 0, -1]     # 오른쪽, 아래, 왼쪽, 위 순서
dy = [1, 0, -1, 0]     # 오른쪽, 아래, 왼쪽, 위 순서
for test_case in range(1, T + 1):
    n = int(input())
    arr = [[0] * n for _ in range(n)]

    x, y = 0, 0
    dist = 0

    for i in range(1, n*n + 1):
        arr[x][y] = i
        x += dx[dist]
        y += dy[dist]

        if x < 0 or y < 0 or x >= n or y >= n or arr[x][y] != 0:
            x -= dx[dist]
            y -= dy[dist]

            dist = (dist + 1) % 4
            x += dx[dist]
            y += dy[dist]

    print(f'#{test_case}')
    for row in arr:
        print(*row)


