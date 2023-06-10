def solution(a, b):
    answer = 0
    a = str(a)
    b = str(b)
    word = ""
    word2 = ""
    
    word = a + b
    word2 = b + a

    if(int(word) > int(word2)):
        return int(word)
    return int(word2)