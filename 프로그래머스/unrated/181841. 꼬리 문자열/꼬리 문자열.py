def solution(str_list, ex):
    answer = ''
    for x in str_list:
        if ex in x: continue
        answer+=x
    return answer