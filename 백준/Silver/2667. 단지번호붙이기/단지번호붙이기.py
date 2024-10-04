N = int(input())
graph = [[int(c) for c in input()] for _ in range(N)]
vectors = [(1, 0), (-1, 0), (0, 1), (0, -1)]
count = 0
result = []


def dfs(graph, start_x, start_y):
    graph[start_x][start_y] = 0
    global count
    count += 1
    for v in vectors:
        nx, ny = start_x + v[0], start_y + v[1]
        if 0 <= nx < N and 0 <= ny < N and graph[nx][ny] == 1:
            dfs(graph, start_x + v[0], start_y + v[1])

for i in range(N):
    for j in range(N):
        if graph[i][j] != 0:
            count = 0
            dfs(graph, i, j)
            result.append(count)
result.sort()
print(len(result))
for r in result:
    print(r)
