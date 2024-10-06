import sys


def input():
    return sys.stdin.readline().strip()


N = int(input())

numbs = list(map(int, input().split(" ")))
numbs_set = list(set(numbs))
numbs_set.sort()
numbs_dict = {}
for idx, numb in enumerate(numbs_set):
    numbs_dict[numb] = idx

result = []
for numb in numbs:
    result.append(numbs_dict[numb])

print(*result)
