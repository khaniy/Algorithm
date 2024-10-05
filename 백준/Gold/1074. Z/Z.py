def cal(n, r, c):
    if n == 0:
        return 0
    sep = 2 ** (n - 1)
    if r < sep and c < sep:
        return cal(n - 1, r, c)
    elif r < sep and c >= sep:
        return sep * sep + cal(n - 1, r, c - sep)
    elif r >= sep and c < sep:
        return 2 * sep * sep + cal(n - 1, r - sep, c)
    else:
        return 3 * sep * sep + cal(n - 1, r - sep, c - sep)

N, r, c = map(int, input().split())

print(cal(N, r, c))