import sys
input = sys.stdin.readline

a = int(input())

num = list(map(int, input().split()))

num.sort()

result = 0

for k in range(a):
    find = num[k]
    i = 0
    j = a - 1
    while i < j:
        if num[i] + num[j] == find:
            if i != k and j != k:
                result += 1
                break
            elif i == k:
                i += 1
            elif j == k:
                j -= 1
        elif num[i] + num[j] < find:
            i += 1
        else:
            j -= 1

print(result)