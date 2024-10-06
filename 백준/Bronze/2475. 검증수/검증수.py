import sys


def input():
    return sys.stdin.readline().strip()


numbs = list(map(int, input().split(" ")))
sum = 0
for n in numbs:
    sum += n**2
print(sum%10)