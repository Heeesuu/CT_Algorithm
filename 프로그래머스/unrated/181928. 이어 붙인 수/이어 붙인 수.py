def solution(num_list):
    answer = 0
    even = ""
    odd = ""
    for i in range(len(num_list)):
        if(num_list[i] % 2 == 1):
            odd += str(num_list[i])
        else:
            even += str(num_list[i])
    
    answer = int(odd) + int(even)
        

    return answer