def solution(my_string, is_suffix):
    # If 'is_suffix' is a suffix of 'my_string', return 1. Otherwise, return 0.
    if my_string.endswith(is_suffix):
        return 1
    else:
        return 0