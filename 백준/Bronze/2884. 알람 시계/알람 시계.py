h, m = map(int, input().split())

a = m - 45

if(a < 0):
    if(h == 0) :
        h = 23
        m = 60 + a
    else:
        h = h - 1
        m = 60 + a
else:
    m = a
    
print(h, m)