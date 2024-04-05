def solution(my_string, overwrite_string, s):
    end = len(overwrite_string) + s
    answer = my_string[0:s] + overwrite_string + my_string[end:]
    return answer