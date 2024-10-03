def dfs(graph, start, visited, count):
    visited[start] = True
    count += 1
    for n in graph[start]:
        if not visited[n]:
            count = dfs(graph, n, visited, count)
    return count


N = int(input())
k = int(input())
graph = [[] for _ in range(N + 1)]
for _ in range(k):
    n1, n2 = map(int, input().split())
    graph[n1].append(n2)
    graph[n2].append(n1)

visited = [False] * (N + 1)
count = 0
print(dfs(graph, 1, visited, count) - 1)
