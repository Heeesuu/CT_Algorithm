
def solution(num_list):
    evensum = 0
    oddsum = 0

    for i in range(0, len(num_list), 2):
        evensum += num_list[i]

    for i in range(1, len(num_list), 2):
        oddsum += num_list[i]

    if(oddsum > evensum):
        return oddsum
    return evensum