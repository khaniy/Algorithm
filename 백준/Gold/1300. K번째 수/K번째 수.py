def count_less_equal(mid, N):
    count = 0
    for i in range(1, N + 1):
        # i번째 행에서 mid보다 작거나 같은 숫자의 개수는 min(mid // i, N)이다.
        count += min(mid // i, N)
    return count


def find_kth_number(N, k):
    left, right = 1, N * N
    answer = 0

    while left <= right:
        mid = (left + right) // 2
        if count_less_equal(mid, N) >= k:
            answer = mid
            right = mid - 1
        else:
            left = mid + 1

    return answer


# 입력 받기
N = int(input())
k = int(input())

# K번째 수 찾기
print(find_kth_number(N, k))