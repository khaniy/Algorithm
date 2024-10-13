import sys
from collections import deque

vectors = [(1, 0), (0, 1), (-1, 0), (0, -1)]


def input():
    return sys.stdin.readline().strip()


N = int(input())
blind_graph = []
graph = []
blind_visited = [[False] * N for _ in range(N)]
visited = [[False] * N for _ in range(N)]
for _ in range(N):
    rgb = input()
    blind_row = [c if c != "G" else "R" for c in rgb]
    row = [c for c in rgb]
    graph.append(row)
    blind_graph.append(blind_row)


def bfs(x, y):
    queue = deque([(x, y)])
    visited[x][y] = True
    while queue:
        x, y = queue.popleft()
        color = graph[x][y]
        for dx, dy in vectors:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < N and graph[nx][ny] == color and not visited[nx][ny]:
                queue.append((nx, ny))
                visited[nx][ny] = True


def blind_bfs(x, y):
    queue = deque([(x, y)])
    blind_visited[x][y] = True
    while queue:
        x, y = queue.popleft()
        color = blind_graph[x][y]
        for dx, dy in vectors:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < N and blind_graph[nx][ny] == color and not blind_visited[nx][ny]:
                queue.append((nx, ny))
                blind_visited[nx][ny] = True


cnt = 0
blind_cnt = 0
for i in range(N):
    for j in range(N):
        if not visited[i][j]:
            bfs(i, j)
            cnt += 1

for i in range(N):
    for j in range(N):
        if not blind_visited[i][j]:
            blind_bfs(i, j)
            blind_cnt += 1

print(cnt, blind_cnt)
