import sys
input = sys.stdin.readline

a = int(input())
A = set(map(int, input().split())) # 리스트 대신에 집합을 사용

b = int(input())
B = list(map(int, input().split()))

for i in B:
    if i in A:
        print("1")
    else:
        print("0")
