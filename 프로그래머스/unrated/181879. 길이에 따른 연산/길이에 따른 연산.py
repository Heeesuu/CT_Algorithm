def solution(num_list):
    answer = 0
    
    for i in range(len(num_list)) :
        if(len(num_list) >= 11):
            answer += num_list[i]
        else:
            answer = 1
            for i in range(len(num_list)):
                answer *= num_list[i]
    
    return answer