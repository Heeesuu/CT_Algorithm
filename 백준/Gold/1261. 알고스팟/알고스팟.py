import sys
from collections import deque
input = sys.stdin.readline
m,n = map(int,input().split())
spot = [ list(map(int,input().rstrip())) for _ in range(n)]

dx=[-1,0,1,0]
dy=[0,-1,0,1]

def bfs(x,y):
    checkSpot = [[-1]*m for i in range(n)]
    queue = deque()
    queue.append((x,y))
    checkSpot[x][y] = 0
    while queue:
        xx,yy = queue.popleft()
        for i in range(4):
            nx = xx + dx[i]
            ny = yy + dy[i]
            if 0<=nx<n and 0<=ny<m and checkSpot[nx][ny] == -1:
                if spot[nx][ny] == 0:
                    checkSpot[nx][ny] = checkSpot[xx][yy]
                    queue.appendleft((nx,ny))
                else:
                    checkSpot[nx][ny] = checkSpot[xx][yy] + 1
                    queue.append((nx,ny))
    print(checkSpot[n-1][m-1])
                    
bfs(0,0)