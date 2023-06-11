def solution(my_strings, parts):
    answer = ''
    for idx, part in enumerate(parts):
        s, e =  parts[idx][0], parts[idx][1] 
        answer += my_strings[idx][s : e+1]
    return answer