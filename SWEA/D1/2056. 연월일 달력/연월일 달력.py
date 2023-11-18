T = int(input())
for test_case in range(1, T + 1):
    num = input() #int를 밑에서 줄거면 그냥 input()으로 받아야함
    year, month, day = int(num[0:4]), int(num[4:6]), int(num[6:8])

    if month < 1 or month > 12:
        print(f'#{test_case} -1')
        continue
    if month in [4, 6, 9, 11] and day > 30:
        print(f'#{test_case} -1')
        continue
    if month in [1, 3, 5, 7, 8, 10, 12] and day > 31:
        print(f'#{test_case} -1')
        continue
    if month == 2 and day > 28:
        print(f'#{test_case} -1')
        continue
    if day < 1 or day > 31:
        print(f'#{test_case} -1')
        continue
    print(f'#{test_case} {num[0:4]}/{num[4:6]}/{num[6:8]}')