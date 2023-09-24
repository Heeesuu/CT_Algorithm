def solution(n):
    snake = [n]
    d = ((0,1),(1,0),(0,-1),(-1,0))
    answer = [[0 for i in range(n)] for j in range(n)]
    count,x,y = 0,-1,0
    
    while n > 1:
        n -= 1
        snake.append(n)
        snake.append(n)
    
    for i in range(len(snake)):
        for j in range(snake[i]):
            y += d[i%4][0]
            x += d[i%4][1]
            count += 1
            answer[y][x] = count
        
        
    return answer