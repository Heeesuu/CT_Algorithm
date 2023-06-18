def solution(myString):
    answer = ''
    
    for ch in myString:
        if ch < 'l':
            answer += 'l'
        else:
            answer += ch
    return answer