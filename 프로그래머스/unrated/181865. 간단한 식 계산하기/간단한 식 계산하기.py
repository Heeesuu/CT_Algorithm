def solution(binomial):
    a, op, b = binomial.split(" ")
    
    a = int(a)
    b = int(b)
    
    if op == "+" :
        answer = a + b
    elif op == "-" :
        answer = a - b
    elif op == "*" :
        answer = a * b
    else:
        answer = a / b
    return answer