def solution(arr, k):
    answer = []
    
    for i in range(len(arr)):
        if(k % 2 == 0) :
            answer.append(arr[i] + k) 
        else:
            answer.append(arr[i] * k)
    return answer