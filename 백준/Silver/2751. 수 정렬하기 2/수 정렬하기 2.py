import sys

N = int(sys.stdin.readline())
numbs = [int(sys.stdin.readline()) for _ in range(N)]

numbs.sort()
for i in numbs:
    print(i)
