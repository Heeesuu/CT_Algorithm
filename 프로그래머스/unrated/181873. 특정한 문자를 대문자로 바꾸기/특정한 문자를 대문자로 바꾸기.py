def solution(my_string, alp):
    answer = my_string
    word = alp.upper()

    if(alp in my_string):
        answer = my_string.replace(alp, word)
    return answer