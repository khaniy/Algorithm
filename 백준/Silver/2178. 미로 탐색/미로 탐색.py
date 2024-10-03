from collections import deque

vectors = [(1, 0), (-1, 0), (0, 1), (0, -1)]

N, M = map(int, input().split(" "))
graph = []
for _ in range(N):
    graph.append([int(c) for c in input()])


def bfs(graph, x, y):
    queue = deque([(x, y)])
    N = len(graph)
    M = len(graph[0])
    while queue:
        x, y = queue.popleft()
        for dx, dy in vectors:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == 1:
                queue.append((nx, ny))
                graph[nx][ny] = graph[x][y] + 1

    return graph[N-1][M-1]

print(bfs(graph, 0, 0))