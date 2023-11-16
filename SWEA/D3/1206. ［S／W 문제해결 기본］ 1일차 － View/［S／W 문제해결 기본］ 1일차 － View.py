


Test = 10

for i in range(1, Test+1):
    n = int(input())
    tower = list(map(int, input().split()))

    sunny = 0
    max_tower = 0

    for j in range(2, n-2):
        max_left = max(tower[j-2], tower[j-1])
        max_right = max(tower[j+1], tower[j+2])

        max_tower = max(max_right, max_left)

        if (tower[j] > max_tower):
            sunny += tower[j] - max_tower

    print(f'#{i} {sunny}')
