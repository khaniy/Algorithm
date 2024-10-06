import heapq
import sys


def input():
    return sys.stdin.readline().strip()


N = int(input())
heap_queue = []
for _ in range(N):
    x = int(input())
    if x == 0:
        result = heapq.heappop(heap_queue) if heap_queue else 0
        print(result)
    else:
        heapq.heappush(heap_queue, x)
