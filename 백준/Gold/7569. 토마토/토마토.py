from collections import deque

vectors = [(-1, 0, 0), (1, 0, 0), (0, -1, 0), (0, 1, 0), (0, 0, -1), (0, 0, 1)]


def bfs():
    while queue:
        x, y, z = queue.popleft()
        for dx, dy, dz in vectors:
            nx, ny, nz = x + dx, y + dy, z + dz
            if 0 <= nx < N and 0 <= ny < M and 0 <= nz < H and graph[nz][nx][ny] == 0:
                graph[nz][nx][ny] = graph[z][x][y] + 1
                queue.append((nx, ny, nz))


M, N, H = map(int, input().split())
graph = []
queue = deque()

for h in range(H):
    height = []
    for n in range(N):
        row = list(map(int, input().split()))
        height.append(row)
        for m in range(M):
            if row[m] == 1:
                queue.append((n, m, h))
    graph.append(height)

bfs()

max_days = 0
for h in range(H):
    for n in range(N):
        for m in range(M):
            if graph[h][n][m] == 0:
                print(-1)
                exit(0)
            max_days = max(max_days, graph[h][n][m])

print(max_days - 1 if max_days > 1 else 0)
