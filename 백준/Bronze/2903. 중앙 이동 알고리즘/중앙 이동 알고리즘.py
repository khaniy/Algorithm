import sys


def input():
    return sys.stdin.readline().strip()


N = int(input())



print((2**N+1)**2)
