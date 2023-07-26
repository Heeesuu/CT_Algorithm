import sys
input = sys.stdin.readline

numbers = [0]
numbers += list(input())
numbers.pop()

if numbers[1] == '0':
    print(0)
    exit(0)

length = len(numbers)
dp = [0] * length
dp[0] = dp[1] = 1

for i in range(2, length):
    one = int(numbers[i])
    ten = int(numbers[i-1])*10 + int(numbers[i])
    if one > 0: 
        dp[i] += dp[i-1]
    if ten >= 10 and ten <= 26: 
        dp[i] += dp[i-2]

print(dp[length-1] % 1000000)