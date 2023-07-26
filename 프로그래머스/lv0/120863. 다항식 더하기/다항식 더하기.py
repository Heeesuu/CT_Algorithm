def solution(polynomial):
    polylist = polynomial.split()
    
    x = 0
    s = 0
    
    for i in polylist:
        if i[-1] == "x":
            if i[:-1]:
                x += int(i[:-1])
            else:
                x += 1
        elif i.isdigit():
            s += int(i)
        
    if x == 1:
        if s > 0:
            return f"x + {s}"
        else:
            return f"x"
    elif x > 1:
        if s > 0:
            return f"{x}x + {s}"
        else:
            return f"{x}x"
    else:
        if s > 0:
            return f"{s}"
        else:
            return 0
            