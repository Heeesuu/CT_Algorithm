def solution(str_list, ex):
    tail_string = ''
    filtered_list = []
    
    for string in str_list:
        if ex not in string:
            filtered_list.append(string)
    
    tail_string = ''.join(filtered_list)
    return tail_string