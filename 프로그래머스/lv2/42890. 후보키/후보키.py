from itertools import combinations

def candidateKey(relation, columns):
    uniqueSet = set()
    for row in relation:
        unique = tuple(row[col] for col in columns)
        if unique in uniqueSet:
            return False
        uniqueSet.add(unique)
    return True

def solution(relation):
    colNum = len(relation[0])
    rowNum = len(relation)
    candidateKeyList = []

    for i in range(1, colNum + 1): #조합을 이용하여 후보키인지 확인하기
        for columns in combinations(range(colNum), i):
            if candidateKey(relation, columns):
                candidateKeyList.append(columns)

    # 최소성 만족하는 후보키
    answer = set(candidateKeyList)
    for i in range(len(candidateKeyList)):
        for j in range(i + 1, len(candidateKeyList)):
            if set(candidateKeyList[i]) == set(candidateKeyList[i]) & set(candidateKeyList[j]):
                answer.discard(candidateKeyList[j])
            
    return len(answer)