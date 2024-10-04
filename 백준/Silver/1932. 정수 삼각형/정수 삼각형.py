def func(N, graph):
    for x in range(1, N + 1):
        for y in range(x):
            if y == 0:
                graph[x][y] += graph[x - 1][0]
            elif y == x - 1:
                graph[x][y] += graph[x - 1][-1]
            else:
                graph[x][y] += max(graph[x - 1][y - 1], graph[x - 1][y])
    return graph[N]

N = int(input())
graph = [[0, 0]]
for _ in range(N):
    graph.append(list(map(int, input().split())))
result = max(func(N, graph))
print(result)
