import sys


def input():
    return sys.stdin.readline().strip()


while True:
    numbs = list(map(int, input().split(" ")))
    numbs.sort()
    if numbs[0] == 0 and numbs[1] == 0 and numbs[2] == 0:
        break
    if numbs[0] ** 2 + numbs[1] ** 2 == numbs[2] ** 2:
        print("right")
    else:
        print("wrong")
