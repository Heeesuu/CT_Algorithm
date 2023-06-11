a = int(input())

sum = 1
count = 1
start_index = 1
end_index = 1

while end_index != a:
  if sum == a:
    count += 1
    end_index += 1
    sum += end_index
  
  elif sum > a :
    sum -= start_index
    start_index += 1
  
  else:
    end_index += 1
    sum += end_index

print(count)