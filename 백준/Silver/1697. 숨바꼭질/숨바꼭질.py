from collections import deque

log = [0 for _ in range(100001)]
N, K = map(int, input().split())


def vector(x):
    return x - 1, x + 1, 2 * x


result = []


def bfs(log, start, target):
    queue = deque([start])
    while queue:
        x = queue.popleft()
        if x == target:
            result.append(log[x])

        x1, x2, x3 = vector(x)
        if 0 <= x1 and log[x1] == 0:
            log[x1] = log[x] + 1
            queue.append(x1)
        if x2 <= 100000 and log[x2] == 0:
            log[x2] = log[x] + 1
            queue.append(x2)

        if x3 <= 100000 and log[x3] == 0:
            log[x3] = log[x] + 1
            queue.append(x3)

bfs(log, N,K)

print(min(result))
