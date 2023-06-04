def solution(arr):
    answer = []
    for i in arr:
        for k in range(i):
            answer.append(i)
    return answer