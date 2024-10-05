import math


def min_moves(x, y):
    d = y - x
    n = int(math.sqrt(d))
    moved_d = n ** 2 
    if d == moved_d:
        return 2 * n - 1
    elif moved_d < d <= moved_d + n:
        return 2 * n
    else:
        return 2 * n + 1

T = int(input())

for _ in range(T):
    x, y = map(int, input().split())
    print(min_moves(x, y))