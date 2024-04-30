import sys
input=sys.stdin.readline

n = int(input())
stack = []

for i in range(n):
    inputs = input().split()
    a = int(inputs[0])
    
    if a == 1:
        b = int(inputs[1])
        stack.append(b)
    elif a == 2:
        if len(stack)>0:
            print(stack.pop())
        else:
            print("-1")
    elif a == 3:
        print(len(stack))
    elif a == 4:
        if len(stack) > 0:
            print("0")
        else :
            print("1")
            
    elif a == 5:
        if len(stack)>0:
            print(stack[-1])
        else:
            print("-1")
    