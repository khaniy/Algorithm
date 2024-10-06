import sys

sys.setrecursionlimit(10000)

vectors = [(1, 0), (-1, 0), (0, 1), (0, -1)]


def input():
    return sys.stdin.readline().strip()


def dfs(graph, x, y):
    if graph[x][y] == 0:
        return 0
    elif graph[x][y] == 1:
        graph[x][y] = 0
        for dx, dy in vectors:
            nx, ny = x + dx, y + dy
            if 0 <= nx < len(graph) and 0 <= ny < len(graph[0]) and graph[nx][ny] != 0:
                dfs(graph, nx, ny)
        return 1


T = int(input())

for _ in range(T):
    X, Y, K = map(int, input().split())
    graph = [[0] * Y for _ in range(X)]
    for _ in range(K):
        x, y = map(int, input().split())
        graph[x][y] = 1
    cnt = 0
    for x in range(X):
        for y in range(Y):
            cnt += dfs(graph, x, y)
    print(cnt)