#2050. 알파벳을 숫자로 변환
#굳이 왜 ..


alphabets = input()

numbers = []

for char in alphabets:
    number = ord(char) - 64
    numbers.append(number)

for num in numbers:
    print(num, end=' ')