import sys


def input():
    return sys.stdin.readline().strip()


N = int(input())
P = list(map(int, input().split(" ")))

P.sort()
t = 0
for idx, p in enumerate(P):
    t += p*(len(P)-idx)
print(t)