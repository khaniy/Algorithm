import sys
from collections import deque

vectors = [(1, 0), (-1, 0), (0, 1), (0, -1)]


def bfs(n, m, s_x, s_y):
    global graph
    result = [[-1] * m for _ in range(n)]
    result[s_x][s_y] = 0
    queue = deque([(s_x, s_y)])
    while queue:
        x, y = queue.popleft()
        for dx, dy in vectors:
            nx, ny = x + dx, y + dy
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1 and result[nx][ny] == -1:
                result[nx][ny] = result[x][y] + 1
                queue.append((nx, ny))
    return result

def input():
    return sys.stdin.readline().strip()


n, m = map(int, input().split(" "))
graph = []
is_search = False
sp = []
for y in range(n):
    numbs = list(map(int, input().split(" ")))
    if not is_search:
        for x in range(len(numbs)):
            if numbs[x] == 2:
                sp = [y, x]
                is_search = True
    graph.append(numbs)

result = bfs(n, m, sp[0], sp[1])
for i in range(n):
    for j in range(m):
        if result[i][j] == -1:
            if graph[i][j] == 1:
                print(-1, end=" ")
            else:
                print(0, end=" ")  # 갈 수 없는 땅은 0
        else:
            print(result[i][j], end=" ")  # 나머지는 BFS 결과 출력
    print()
