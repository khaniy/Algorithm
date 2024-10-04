def dp(N):
    record = [0] * (N + 1)
    for i in range(2, N + 1):
        record[i] = record[i - 1] + 1
        if i % 2 == 0:
            record[i] = min(record[i], record[i // 2] + 1)
        if i % 3 == 0:
            record[i] = min(record[i], record[i // 3] + 1)
    return record[N]

N = int(input())
print(dp(N))