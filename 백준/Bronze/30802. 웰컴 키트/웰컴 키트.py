import sys


def input():
    return sys.stdin.readline().strip()


N = int(input())
t_shirts = list(map(int, input().split(" ")))
T, P = map(int, input().split(" "))
t_cnt = 0
for t in t_shirts:
    cnt = 1 + t // T if t % T != 0 else t // T
    t_cnt += cnt
print(t_cnt)
print(N // P, N % P)
