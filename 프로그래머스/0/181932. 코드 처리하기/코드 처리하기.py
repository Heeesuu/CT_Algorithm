def solution(code):
    answer = ''
    idx = 0
    mode = 0
    
    for i in code:
        if mode == 0:
            if i == '1':
                mode = 1
            else:
                if idx % 2 == 0:
                    answer += i
        else:
            if i == '1':
                mode = 0
            else:
                if idx % 2 == 1:
                    answer += i
        idx += 1
    
    if answer == '':
        return "EMPTY"
    
    return answer