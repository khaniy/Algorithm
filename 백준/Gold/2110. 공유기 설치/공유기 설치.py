def binary_search_max_distance(arr, C):
    start = 1
    end = arr[-1] - arr[0]
    result = 0
    while start <= end:
        dist = (start + end) // 2
        cnt = 1
        last = arr[0]
        for i in arr:
            if i >= last + dist:
                cnt += 1
                last = i
        if cnt >= C:
            start = dist + 1
            result = dist
        else:
            end = dist - 1

    return result


N, C = map(int, input().split())
houses = [int(input()) for _ in range(N)]
houses.sort()

print(binary_search_max_distance(houses, C))
