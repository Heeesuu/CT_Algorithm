import sys
input = sys.stdin.readline

a, b = map(int, input().split())
num = list(map(int, input().split()))
temp = 0
sum = 0
S = [0]

for i in num:
    temp = temp + i
    S.append(temp)


for i in range(b):
    c, d = map(int, input().split())
    sum = S[d] - S[c-1]
    print(sum)