from collections import deque

M, N = map(int, input().split(" "))


def bfs(graph, N, M, sp):
    queue = deque(sp)
    vectors = [(1, 0), (-1, 0), (0, 1), (0, -1)]
    while queue:
        x, y = queue.popleft()

        for dx, dy in vectors:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == 0:
                queue.append((nx, ny))
                graph[nx][ny] = graph[x][y] + 1
    max_days = 0
    for r in graph:
        for v in r:
            if v == 0:
                return -1 
            max_days = max(max_days, v)

    return max_days - 1

graph = []
sp = []
for n in range(N):
    row = list(map(int, input().split(" ")))
    for m in range(M):
        if row[m] == 1:
            sp.append((n, m))
    graph.append(row)
print(bfs(graph, N, M, sp))
