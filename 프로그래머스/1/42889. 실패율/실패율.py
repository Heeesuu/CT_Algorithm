def solution(N, stages):
    answer = []
    a = len(stages) 
    
    for i in range(1, N+1):
        cnt = stages.count(i)
        if a > 0:
            temp = cnt / a  
            answer.append((i, temp))
            a -= cnt
        else:
            answer.append((i, 0)) 
    
    answer.sort(key=lambda x: (-x[1], x[0]))
    
    return [stage[0] for stage in answer]