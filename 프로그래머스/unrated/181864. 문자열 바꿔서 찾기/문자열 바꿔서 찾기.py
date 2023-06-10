def solution(myString, pat):
    answer = ""

    for i in myString:
        if(i == "A"):
            answer += "B"
        else:
            answer += "A"

    if(pat in answer):
        return 1
    
    return 0