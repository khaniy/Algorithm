import sys

def input():
    return sys.stdin.readline().strip()

N, M = map(int, input().split())

not_heard = set(input() for _ in range(N))

not_seen = set(input() for _ in range(M))

not_heard_and_seen = sorted(not_heard & not_seen)

print(len(not_heard_and_seen))
for name in not_heard_and_seen:
    print(name)