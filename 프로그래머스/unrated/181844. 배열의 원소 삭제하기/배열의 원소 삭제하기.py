def solution(arr, delete_list):
    answer = []
    for i in arr:
        if i in delete_list:
            continue
        else:
            answer.append(i)
    return answer