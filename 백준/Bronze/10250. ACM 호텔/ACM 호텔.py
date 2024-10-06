import sys


def input():
    return sys.stdin.readline().strip()


T = int(input())
for _ in range(T):
    H, W, N = map(int, input().split())
    h = N // H + 1 if N % H else N // H
    floor = N % H * 100 if N % H else H * 100
    print(floor+h)
