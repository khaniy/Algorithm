import sys


def input():
    return sys.stdin.readline().strip()


numbs = [numb for numb in input()]
N = 0
while numbs:
    N += 1
    N_sep = [k for k in str(N)]

    for n in N_sep:
        if numbs and numbs[0] == n:
            numbs.pop(0)

print(N)


