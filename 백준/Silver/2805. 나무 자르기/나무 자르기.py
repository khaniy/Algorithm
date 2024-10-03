def sum(arr, cut):
    total = 0
    for tree in trees:
        if tree > cut:
            total += tree - cut
    return total


N, M = map(int, input().split(" "))
trees = list(map(int, input().split(" ")))
trees.sort()

min_h = 1
max_h = max(trees)
result = 0

while min_h <= max_h:
    cut = (min_h + max_h) // 2
    h_sum = sum(trees, cut)
    if h_sum >= M:
        min_h = cut + 1
        result = cut
    else:
        max_h = cut - 1

print(result)
