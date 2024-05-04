N = int(input())
scores = list(map(int,input().split()))
scores.sort()

M = scores[-1]
sum = 0

for i in scores:
    sum += (i / M) * 100

sum = float(sum / N)
print(sum)
    
