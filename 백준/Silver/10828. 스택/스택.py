import sys

n = int(sys.stdin.readline())

stack = []

for i in range(n):
    command = sys.stdin.readline().strip()

    if("push" in command):
        _, num = command.split()
        num = int(num)
        stack.append(num)

    elif("top" in command):
        if not stack:
            print(-1)
        else:
            print(stack[-1])
        
    elif("size" in command):
        print(len(stack))
    
    elif("empty" in command):
        if not stack:
            print(1)
        else:
            print(0)

    elif("pop" in command):
        if not stack:
            print(-1)
        else:
            print(stack.pop())