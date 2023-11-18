#1936. 1대1 가위바위보

A, B = map(int, input().split())

if A == 1 and B == 2:
    print("B")

if A == 1 and B == 3:
    print("A")
    
if A == 2 and B == 1:
    print("A")

if A == 2 and B == 3:
    print("B")

if A == 3 and B == 1:
    print("B")

if A == 3 and B == 2:
    print("A")