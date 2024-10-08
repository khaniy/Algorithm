def dynamic(N):
    dp = [0] * (N+1)
    dp[1] = 1
    if N > 1:
        dp[2] = 3
    for i in range(3, n + 1):
        dp[i] = (dp[i - 1] + 2 * dp[i - 2])
    return dp[N]


n = int(input())
print(dynamic(n) % 10007)
