def solution(a, d, included):
    answer = []
    sum = 0
    for i in range(len(included)):
        if included[i]:
            answer.append(i)
    
    for i in answer:
        if i == 0:
            sum += a
        else:
            sum += a + (d * i)
    
    return sum