import sys
input = sys.stdin.readline

n = int(input())
A = list(map(int, input().split()))
A.sort()

count = 0

for i in range(n):
    start = 0
    end = n - 1
    while start < end:
        if start == i:
            start += 1
            continue
        if end == i:
            end -= 1
            continue
        if A[start] + A[end] == A[i]:
            count += 1
            break
        elif A[start] + A[end] < A[i]:
            start += 1
        else:
            end -= 1

print(count)
