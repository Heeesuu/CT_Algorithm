answer = []

a = int(input())

for i in range(a):
  i = int(input())
  answer.append(i)

answer.sort()

for i in range(a):
  print(answer[i])