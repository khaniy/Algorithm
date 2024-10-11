import sys
from collections import deque

vectors = [(1, 0), (-1, 0), (0, 1), (0, -1)]


# O는 빈 공간, X는 벽, I는 도연이, P는 사람이다. I가 한 번만 주어짐이 보장된다.

def input():
    return sys.stdin.readline().strip()


N, M = map(int, input().split(" "))
graph = []
visited = []
for _ in range(N):
    graph.append([])
    visited.append([])
start = []

for n in range(N):
    row = input()
    for r, c in enumerate(row):
        graph[n].append(c)
        visited[n].append(False)
        if c == "I":
            start = [n, r]


def bfs(start):
    cnt = 0
    queue = deque([start])
    while queue:
        x, y = queue.popleft()
        if graph[x][y] == "P":
            cnt += 1
        for dx, dy in vectors:
            nx, ny = x + dx, y + dy
            if 0 <= nx < N and 0 <= ny < M and not visited[nx][ny] and graph[nx][ny] != "X":
                visited[nx][ny] = True
                queue.append((nx, ny))
    return cnt

result = bfs(start)

print(result if result else "TT")
