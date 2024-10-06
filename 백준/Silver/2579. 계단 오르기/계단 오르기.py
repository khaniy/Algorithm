import sys


def input():
    return sys.stdin.readline().strip()


def dynamic(N):
    global stairs
    if N == 1:
        return stairs[0]
    elif N == 2:
        return stairs[0] + stairs[1]
    dp = [0] * (N + 1)
    dp[1] = stairs[0]
    dp[2] = stairs[0] + stairs[1]
    for i in range(3, N + 1):
        dp[i] = max(dp[i - 2], dp[i - 3] + stairs[i - 2]) + stairs[i - 1]
    return dp[N]


N = int(input())

stairs = [int(input()) for _ in range(N)]

print(dynamic(N))
