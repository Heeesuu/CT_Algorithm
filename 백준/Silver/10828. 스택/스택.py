import sys
input = sys.stdin.readline

n = int(input())

stack = []

for i in range(n):
    a = str(input())

    if("push" in a):
        b, c = a.split(" ")
        c = int(c)
        stack.append(c)

    elif("top" in a):
        if(len(stack) == 0):
            print(-1)
        else:
            print(stack[-1])
        
    elif("size" in a):
        print(len(stack))
    
    elif("empty" in a):
        if(len(stack) == 0):
            print(1)
        else:
            print(0)

    elif("pop" in a):
        if(len(stack) == 0):
            print(-1)
        else:
            top = stack.pop()
            print(top)
