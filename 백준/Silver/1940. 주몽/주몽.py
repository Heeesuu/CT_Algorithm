n = int(input())
m = int(input())

A = list(map(int, input().split()))
A.sort()

start_index = 0
end_index = n - 1
count = 0

while(start_index < end_index) :
  if(A[start_index] + A[end_index] < m):
    start_index += 1
  
  elif(A[start_index] + A[end_index] > m):
    end_index -= 1
  
  else:
    count += 1
    start_index += 1
    end_index -= 1

print(count)