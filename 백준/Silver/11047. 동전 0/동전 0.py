import sys

def input():
    return sys.stdin.readline().strip()

N, K = map(int, input().split())

coins = [int(input()) for _ in range(N)]

cnt = 0
for i in range(N):
    coin = coins[N-i-1]
    avl_cnt = K // coin
    if avl_cnt > 0:
        cnt += avl_cnt
        K -= avl_cnt * coin

print(cnt)
