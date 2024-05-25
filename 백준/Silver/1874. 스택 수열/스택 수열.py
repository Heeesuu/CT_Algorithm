
n = int(input())
stack = []
answer = []
cnt = 1
stack.append(0)

for _ in range(n):
    a = int(input())
    while cnt <= a:
        stack.append(cnt)
        answer.append("+")
        cnt += 1
    if a == stack[-1]:
        stack.pop()
        answer.append("-")
    else :
        print("NO")
        break
else:
    print("\n".join(answer))