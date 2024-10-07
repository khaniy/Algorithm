import sys
sys.setrecursionlimit(10**6)
def input():
    return sys.stdin.readline().strip()


def dfs(start_node):
    visited[start_node] = True
    for node in graph[start_node]:
        if not visited[node]:
            dfs(node)


N, M = map(int, input().split(" "))
graph = [[] for _ in range(N + 1)]
for _ in range(M):
    a, b = map(int, input().split(" "))
    graph[a].append(b)
    graph[b].append(a)

visited = [False] * (N + 1)
cnt = 0
for node in range(1, N + 1):
    if not visited[node]:
        dfs(node)
        cnt += 1
print(cnt)
