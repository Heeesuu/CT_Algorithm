#1978
n = int(input())
numbers = map(int, input().split())
answer = 0

for a in numbers:
    if a == 1:
        continue
    is_prime = True
    for i in range(2, int(a**0.5) + 1):
        if a % i == 0:
            is_prime = False
            break
    if is_prime:
        answer += 1

print(answer)
