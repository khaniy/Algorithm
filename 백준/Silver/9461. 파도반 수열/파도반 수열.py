def dynamic(N):

    if 6 <= N:
        dp = [1] * (N + 2)
        dp[1] = 1
        dp[2] = 1
        dp[3] = 1
        dp[4] = 2
        dp[5] = 2
        for n in range(6, N + 1):
            dp[n] = dp[n-1] + dp[n-5]
    else:
        dp = [1] * 6
        dp[1] = 1
        dp[2] = 1
        dp[3] = 1
        dp[4] = 2
        dp[5] = 2
    return dp[N]


T = int(input())
for _ in range(T):
    t = int(input())
    print(dynamic(t))
