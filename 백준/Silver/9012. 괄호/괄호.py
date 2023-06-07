import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    brackets = input().strip()
    sum = 0
    for b in brackets:
        if b == '(':
            sum += 1
        elif b == ')':
            sum -= 1
        if sum < 0:
            print("NO")
            break
    else:
        if sum == 0:
            print("YES")
        else:
            print("NO")
    
    