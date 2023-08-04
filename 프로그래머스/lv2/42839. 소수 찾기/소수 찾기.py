from itertools import permutations

#소수 판별 함수
def is_prime_number(x) :
    if x < 2 :
        return False
    
    for i in range(2, x) :
        if x % i == 0 :
            return False
            
    return True


def solution(numbers):
    answer = 0
    
    num = []
    for i in range(1, len(numbers)+1) :
        #순열 모듈 사용해서 나올 수 있는 모든 수 조합
        num.append(list(set(map(''.join, permutations(numbers, i)))))
    per = list(set(map(int, set(sum(num, [])))))
    
    for p in per :
        if is_prime_number(p) == True :
            answer += 1

    return answer