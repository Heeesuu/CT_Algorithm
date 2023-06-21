from collections import deque

def solution(num_list, n):
    queue = deque(num_list)
    
    for i in range(n):
        queue.append(queue.popleft())
    
    return list(queue)