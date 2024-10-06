import sys


def input():
    return sys.stdin.readline().strip()


N = int(input())
times = []

for _ in range(N):
    s, e = map(int, input().split(" "))
    times.append((s, e))

times.sort(key=lambda x: (x[1], x[0]))
cnt = 0
last_end = 0
for start, end in times:
    if start >= last_end:
        cnt += 1
        last_end = end

print(cnt)
