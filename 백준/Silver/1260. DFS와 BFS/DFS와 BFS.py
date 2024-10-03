from collections import deque

# DFS 함수 구현 (재귀 방식)
def dfs(graph, v, visited):
    visited[v] = True
    dfs_result.append(v)
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

# BFS 함수 구현 (큐 사용)
def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    bfs_result.append(start)
    
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True
                bfs_result.append(i)

# 입력 받기
N, M, V = map(int, input().split())

# 그래프 초기화
graph = [[] for _ in range(N + 1)]

# 간선 정보 입력
for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

# 정점 번호가 작은 순으로 방문하기 위해 각 리스트 정렬
for i in range(1, N + 1):
    graph[i].sort()

# 방문 여부 체크 리스트
visited_dfs = [False] * (N + 1)
visited_bfs = [False] * (N + 1)

# 결과 저장 리스트
dfs_result = []
bfs_result = []

# DFS 수행
dfs(graph, V, visited_dfs)

# BFS 수행
bfs(graph, V, visited_bfs)

# 결과 출력
print(" ".join(map(str, dfs_result)))
print(" ".join(map(str, bfs_result)))