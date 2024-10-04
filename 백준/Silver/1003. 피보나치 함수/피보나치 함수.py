def fibonacci(N):
    dp = [[0,0] for _ in range(40 + 1)]
    dp[0] = [1, 0]
    dp[1] = [0, 1]
    for i in range(2, N + 1):
        dp[i] = [x1 + x2 for x1, x2 in zip(dp[i - 1], dp[i - 2])]
    return dp[N]


N = int(input())
for _ in range(N):
    n = int(input())
    print(*fibonacci(n))
