import sys


def input():
    return sys.stdin.readline().strip()


N, M, B = map(int, input().split(" "))
store = {}
for _ in range(N):
    numbs = list(map(int, input().split(" ")))
    for n in numbs:
        store[n] = store[n] + 1 if n in store else 1


def cal():
    r_height = 0
    opt_time = float('inf')
    for height in range(257):
        added_block = 0
        popped_block = 0
        for h, num in store.items():
            if h > height:
                popped_block += num * (h - height)
            elif h < height:
                added_block += num * (height - h)

        if added_block <= popped_block + B:
            elapsed_time = added_block + popped_block * 2
            if elapsed_time < opt_time or (elapsed_time == opt_time and r_height < height):
                opt_time = elapsed_time
                r_height = height
    return opt_time, r_height


t, h = cal()
print(t, h)
