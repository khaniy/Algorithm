import sys


def input():
    return sys.stdin.readline().strip()


numbs = [input()for _ in range(3)]




print(int(numbs[0]) + int(numbs[1]) - int(numbs[2]))
print(int(numbs[0]+numbs[1]) - int(numbs[2]))
