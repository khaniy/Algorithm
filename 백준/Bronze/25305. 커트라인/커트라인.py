import sys

M, k = map(int, sys.stdin.readline().split())
scores = list(map(int, sys.stdin.readline().split()))


def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j]> arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

    return arr

scores = bubble_sort(scores)
print(scores[M-k])
