import sys
from itertools import combinations
input= sys.stdin.readline

n,k= map(int,input().split())
alpha= ['b','c','d','e','f','g','h','j','k','l','m','o','p','q','r','s',
       'u','v','w','x','y','z']

maxRead =- 1

if k >= 5:
    learnlist= list(combinations(alpha,k-5)) #조합
    antic= {'a','n','t','i','c'} #set생성
    words= list()

    for _ in range(n):
        words.append(set(input().rstrip())-antic)

    for p in learnlist:
        a= set(p)
        count= 0
        for k in words:
            if k.issubset(a): #부분집합인지 확인
                count += 1
        maxRead = max(maxRead,count)
    print(maxRead)
else:
    print(0)