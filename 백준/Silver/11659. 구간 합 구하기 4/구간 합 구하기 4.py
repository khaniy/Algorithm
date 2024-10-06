import sys


def input():
    return sys.stdin.readline().strip()


N, M = map(int,input().split(" "))
numbs = list(map(int, input().split(" ")))
sum = [0]
for i, numb in enumerate(numbs):
    sum.append(sum[i] + numb)


for _ in range(M):
    i, j = map(int, input().split(" "))
    print(sum[j] - sum[i-1])