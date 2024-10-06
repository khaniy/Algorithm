import heapq
import sys

def input():
    return sys.stdin.readline().strip()

N, K = map(int, input().split())

items = []
for _ in range(N):
    m, v = map(int, input().split())
    items.append((m, v))

bags = []
for _ in range(K):
    c = int(input())
    bags.append(c)

items.sort()
bags.sort()

max_heap = []
max_price = 0
jewel_index = 0


for bag in bags:
    while jewel_index < N and items[jewel_index][0] <= bag:
        heapq.heappush(max_heap, -items[jewel_index][1])
        jewel_index += 1
    if max_heap:
        max_price += -heapq.heappop(max_heap)

print(max_price)