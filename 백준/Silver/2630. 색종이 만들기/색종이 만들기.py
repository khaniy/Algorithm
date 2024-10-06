import sys


def input():
    return sys.stdin.readline().strip()


def sum_all(arr, x, y, N):
    sum = 0
    for i in range(x, x + N):
        for j in range(y, y + N):
            sum += arr[j][i]
    return sum


def search(tb, x, y, N):
    global w_cnt, b_cnt
    sum = sum_all(tb, x, y, N)
    half_n = N // 2
    if sum == N ** 2:
        b_cnt += 1
    elif sum == 0:
        w_cnt += 1
    else:
        search(tb, x, y, half_n)
        search(tb, x + half_n, y, half_n)
        search(tb, x, y + half_n, half_n)
        search(tb, x + half_n, y + half_n, half_n)


N = int(input())
tb = [list(map(int, input().split(" "))) for _ in range(N)]
w_cnt = 0
b_cnt = 0
search(tb, 0, 0, N)
print(w_cnt)
print(b_cnt)
