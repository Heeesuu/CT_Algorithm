def solution(arr, queries):
    result = []
    
    for query in queries:
        s, e, k = query
        answer = []
        
        for j in range(s, e + 1):
            if arr[j] > k:
                answer.append(arr[j])
        
        if not answer:
            result.append(-1)
        else:
            result.append(min(answer))

    return result