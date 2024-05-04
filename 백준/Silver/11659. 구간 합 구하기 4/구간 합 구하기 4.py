import sys
input = sys.stdin.readline

N, M = map(int, input().split())
numbers = list(map(int, input().split()))

S = [0]
temp = 0

for i in numbers:
    temp = temp + i
    S.append(temp)

for i in range(M):
    i, j = map(int, input().split())
    print(S[j] - S[i -1])
