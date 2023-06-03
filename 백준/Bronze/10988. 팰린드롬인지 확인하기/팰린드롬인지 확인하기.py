a = input()

word = list(a)
reword = list(a)

reword.reverse()

if(word == reword):
    print(1)
else:
    print(0)