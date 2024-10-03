import sys


def input():
    return sys.stdin.readline().strip()


K, N = map(int, input().split(" "))

lans = [int(input()) for _ in range(K)]

min = 1
max = 2* max(lans)
result = 0
while min <= max:

    mid = (min + max) // 2
    cnt = 0
    for lan in lans:
        cnt += lan//mid
    
    if cnt < N:
        max = mid -1
    else:
        min = mid + 1
        result = mid

print(result)
