def solution(dirs):
    answer = 0
    loca = [0, 0]
    visited = []
    for i in dirs:
        vist = False
        temp_loca = loca[:]
        
        if i == "R" and loca[0] < 5:
            loca[0] += 1
        elif i == "L" and loca[0] > -5:
            loca[0] -= 1
        elif i == "U" and loca[1] < 5:
            loca[1] += 1
        elif i == "D" and loca[1] > -5:
            loca[1] -= 1
        else:
            continue
            
        move = (tuple(temp_loca), tuple(loca))
        reverse_move = (tuple(loca), tuple(temp_loca))
        
        if move not in visited and reverse_move not in visited:
            answer += 1
            visited.append(move)
            visited.append(reverse_move)
        
    return answer