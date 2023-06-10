def solution(arr1, arr2):
    # 먼저 두 배열의 길이를 비교
    if len(arr1) > len(arr2):
        return 1
    elif len(arr1) < len(arr2):
        return -1
    # 길이가 같을 경우에는 요소의 합을 비교
    else:
        sum1 = sum(arr1)
        sum2 = sum(arr2)
        if sum1 > sum2:
            return 1
        elif sum1 < sum2:
            return -1
        else:
            return 0