n = int(input())
arr = []
arr_y = []
arr_x = []
answer = [-1]*n

# 입력 받기
for _ in range(n):
    a,b = map(int,input().split())
    arr.append([a,b])
    arr_y.append(b)
    arr_x.append(a)

# 만날 장소 정하기
for y in arr_y:
    for x in arr_x:
        dist = []
        
        # 만날 장소로 각각의 점들이 오는 비용 계산하기
        for ex,ey in arr:
            d = abs(ex-x) + abs(ey-y)
            dist.append(d)

        
        # 가까운 순서대로 정렬하기
        dist.sort()

        tmp = 0 
        for i in range(len(dist)):
            d = dist[i]
            tmp += d
            if answer[i] == -1: 
                answer[i] = tmp

            else :
                answer[i] = min(tmp, answer[i])

print(*answer)