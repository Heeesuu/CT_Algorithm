def solution(babbling):
    answer = 0
    speek4 = ["aya","woo"]
    speek2 = ["ye", "ma"]
    
    for babble in babbling:
        while babble:
            if babble[:3] in speek4:
                babble = babble[3:]
            elif babble[:2] in speek2:
                babble = babble[2:]
            else:
                break
        if babble =="":
            answer += 1

    return answer