import sys
from collections import deque


# bfs 탐색
def bfs():
    queue = deque([[sz, sy, sx]])
    dx = [1, -1, 0, 0, 0, 0]
    dy = [0, 0, -1, 1, 0, 0]
    dz = [0, 0, 0, 0, 1, -1]

    while queue:

        z, y, x = queue.popleft()

        # 도착지점이라면 출력값 리턴
        if x == ex and y == ey and z == ez:
            return "Escaped in {0} minute(s).".format(visited[z][y][x])

        # 반복문을 통해 동/서/남/북/상/하 탐색
        for i in range(6):
            nx = x + dx[i]
            ny = y + dy[i]
            nz = z + dz[i]

            # 범위내에 있고 탐색하지 않았다면 탐색
            if 0 <= nx < c and 0 <= ny < r and 0 <= nz < l and visited[nz][ny][nx] == 0:
                # 탐색하는 곳이 금이 아니라면 탐색
                if building[nz][ny][nx] == "." or building[nz][ny][nx] == "E":
                    visited[nz][ny][nx] = visited[z][y][x] + 1
                    queue.append([nz, ny, nx])

    # 도착지점에 도착하지 못했다면 Trapped! 리턴
    return "Trapped!"


# 반복문을 통해 각 테스트를 확인
while True:
    l, r, c = map(int, sys.stdin.readline().split())

    # L, R, C가 모두 0이면 반복을 멈춘다.
    if l == 0 and r == 0 and c == 0:
        break

    building = [[] * r for _ in range(l)]
    visited = [[[0 for _ in range(c)] for _ in range(r)] for _ in range(l)]

    # 반복문을 통해 그래프를 나타낸다.
    for i in range(l):
        for _ in range(r):
            building[i].append(list(map(str, sys.stdin.readline().strip())))
        sys.stdin.readline()

    # 반복문을 통해 S와 E의 좌표를 확인한다.
    for i in range(l):
        for j in range(r):
            for k in range(c):
                if building[i][j][k] == "S":
                    sx, sy, sz = k, j, i
                elif building[i][j][k] == "E":
                    ex, ey, ez = k, j, i

    print(bfs())