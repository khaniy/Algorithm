import sys
from collections import deque


def input():
    return sys.stdin.readline().strip()


N, M = map(int, input().split(" "))
board = {}
visited = [-1] * 101
for _ in range(N):
    x, y = map(int, input().split(" "))
    board[x] = y
for _ in range(M):
    u, v = map(int, input().split(" "))
    board[u] = v

def bfs(start):
    queue = deque([start])
    visited[start] = 0
    while queue:
        x = queue.popleft()

        if x == 100:
            return visited[x]

        for v in range(1,7):
            nx = x + v
            if nx > 100:
                continue
            if nx in board:
                nx = board[nx]

            if visited[nx] == -1:
                visited[nx] = visited[x] + 1
                queue.append(nx)
    return -1

print(bfs(1))