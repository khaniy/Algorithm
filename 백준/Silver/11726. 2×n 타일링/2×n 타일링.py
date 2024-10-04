def func(N):
    dp = [0] * 1001
    dp[1] = 1
    dp[2] = 2
    for i in range(3, N + 1):
        dp[i] = dp[i - 1] + dp[i - 2]
    return dp[N]


N = int(input())
result = func(N)
print(result % 10007)
