import sys


def input():
    return sys.stdin.readline().strip()

N = 1
for _ in range(3):
    N *= int(input())

store = [0]*10
for c in str(N):
    store[int(c)] += 1

for i in store:
    print(i)