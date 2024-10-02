N = 5
numbers = []
count = 0
for _ in range(N):
    n = int(input())
    numbers.append(n)
    count += n


def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr


sort = bubble_sort(numbers)

print(count // 5)
print(sort[2])
