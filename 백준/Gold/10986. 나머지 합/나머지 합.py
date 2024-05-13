import sys
input = sys.stdin.readline

n, m = map(int, input().split())
numlist = list(map(int, input().split()))

s = [0] * n
c = [0] * m

s[0] = numlist[0]
answer = 0

for i in range(1, n):
    s[i] = s[i-1] + numlist[i]
    
for i in range(n):
    remainder = s[i] % m
    if remainder == 0:
        answer += 1
    c[remainder] += 1

for i in range(m):
    if c[i] > 1:
        answer += (c[i] * (c[i]- 1) // 2)
        
print(answer)