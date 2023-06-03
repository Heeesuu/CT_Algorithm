from functools import reduce

def solution(num_list):
    # 리스트 원소들의 곱을 계산
    product = reduce(lambda x, y: x * y, num_list)
    # 리스트 원소들의 합을 계산
    sum_of_elements = sum(num_list)
    # 원소들의 합의 제곱을 계산
    sum_squared = sum_of_elements ** 2

    if product < sum_squared:
        return 1
    else:
        return 0