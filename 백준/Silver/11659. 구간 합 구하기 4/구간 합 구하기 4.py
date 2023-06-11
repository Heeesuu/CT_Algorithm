import sys
input = sys.stdin.readline

a, b = map(int, input().strip().split())
A = list(map(int, input().strip().split()))

S = [0]
for i in range(a):
    S.append(S[i] + A[i])

for _ in range(b):
    n, m = map(int, input().strip().split())
    if n > 1:
        print(S[m] - S[n - 1])
    else:
        print(S[m])
