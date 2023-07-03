import sys
input = sys.stdin.readline

a,b = map(int, input().split())

A = list(map(int, input().split()))
S = [0 for _ in range(a)]
S[0] = A[0]

for i in range(1, a):
    S[i] = S[i - 1] + A[i]


for i in range(b):
    m, n = map(int, input().split())
    if m == 1:
        print(S[n-1])
    else:
        print(S[n-1] - S[m-2])