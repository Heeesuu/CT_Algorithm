def solution(num_list):
    answer = -1
    for i, num in enumerate(num_list):
        if num < 0 :
            return i
    return answer