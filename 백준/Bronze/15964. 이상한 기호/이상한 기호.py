import sys


def input():
    return sys.stdin.readline().strip()


A, B = map(int, input().split(" "))

print(A ** 2 - B ** 2)