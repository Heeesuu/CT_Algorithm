import sys
#재귀호출의 최대 깊이 설정
sys.setrecursionlimit(10000) 
input = sys.stdin.readline

#노드 개수, 에지 개수 받아서 A(인접 그래프), 방문리스트 정의
n, m = map(int, input().split())
A = [[] for _ in range(n+1)]
visited = [False] * (n+1)

#DFS -> 방문 처리
def DFS(v):
    visited[v] = True
    for i in A[v]:
        if not visited[i]:
            DFS(i)

#입력값 받아서 A(인접 그래프 리스트)에 저장
for _ in range(m):
    s, e = map(int, input().split())
    A[s].append(e)
    A[e].append(s)

count = 0

#DFS 실행
for i in range(1, n+1):
    if not visited[i]:
        count += 1
        DFS(i)

print(count)


