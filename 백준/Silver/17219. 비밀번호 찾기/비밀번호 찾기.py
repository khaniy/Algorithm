import sys


def input():
    return sys.stdin.readline().strip()


N, M = map(int, input().split())
s = {}
for _ in range(N):
    d, n = input().split(" ")
    s[d] = n
for _ in range(M):
    x = input()
    print(s[x])