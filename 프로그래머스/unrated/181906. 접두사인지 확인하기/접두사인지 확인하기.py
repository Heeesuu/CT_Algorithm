def solution(my_string, is_prefix):
    answer = 0
    prefix = my_string[:len(is_prefix)]
    
    if(prefix == is_prefix):
        answer = 1
    return answer