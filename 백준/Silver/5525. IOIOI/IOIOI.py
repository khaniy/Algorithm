import sys


def input():
    return sys.stdin.readline().strip()


N = int(input())
M = int(input())
S = input()

cnt = 0
i = 0
pattern = "IOI"
pattern_cnt = 0
while i < M - 1:

    if S[i:i + 3] == pattern:
        pattern_cnt += 1
        i += 2
        if pattern_cnt == N:
            cnt += 1
            pattern_cnt -= 1
    else:
        pattern_cnt = 0
        i += 1

print(cnt)
