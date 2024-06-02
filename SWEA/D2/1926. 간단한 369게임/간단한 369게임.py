
#import sys
#sys.stdin = open("input.txt", "r")

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    certi = [0] * 4
    certi = list(map(int, str(test_case)))
    flag = False
    doubleFlag = False
    for a in certi:
        if a != 0 and a % 3 == 0:
            if flag: 
                doubleFlag = True 
            flag = True 
    if doubleFlag:
        print("--", end=' ')
    elif flag:
        print("-", end=' ')
    else:
        print(test_case, end=' ')
