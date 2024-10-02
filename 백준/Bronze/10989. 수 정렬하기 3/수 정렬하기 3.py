import sys


def input():
    return sys.stdin.readline()


N = int(input())

count = [0] * 10001

for _ in range(N):
    n = int(input())
    count[n] += 1

for c in range(len(count)):
    if count[c] != 0:
        for _ in range(count[c]):
            print(c)
