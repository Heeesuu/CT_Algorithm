a = int(input())

score = list(map(int, input().split()))

score.sort()
answer = 0

M = score[-1]

for i in score:
  answer += (i / M) * 100

answer = float(answer / a)
print(answer)