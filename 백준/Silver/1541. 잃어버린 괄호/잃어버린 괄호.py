import sys


def input():
    return sys.stdin.readline().strip()


N = input()
N = N.split("-")
result = 0
for idx, n in enumerate(N):
    s = sum(map(int, n.split("+")))
    if idx == 0:
        result += s
    else:
        result -= s

print(result)
