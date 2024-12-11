def solution(l, r):
    answer = []
    for i in range(l, r + 1):
        if all(c in '05' for c in str(i)):  # 숫자가 '0'과 '5'로만 이루어졌는지 확인
            answer.append(i)
    return answer if answer else [-1]