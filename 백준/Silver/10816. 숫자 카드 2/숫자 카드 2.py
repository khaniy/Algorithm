import sys
from collections import Counter


def bs(arr, target):
    s_id, e_id = 0, len(arr) - 1
    while s_id <= e_id:
        m_id = (s_id + e_id) // 2
        if arr[m_id] == target:
            return 1
        elif target < arr[m_id]:
            e_id = m_id - 1
        else:
            s_id = m_id + 1
    return 0


def input():
    return sys.stdin.readline().strip()


N = int(input())
cards = list(map(int, input().split(" ")))
cards.sort()
counts = Counter(cards)

M = int(input())
search = list(map(int, input().split(" ")))
result = [counts.get(s, 0) for s in search]
print(*result)
