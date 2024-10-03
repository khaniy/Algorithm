import sys

def bs(arr, target):
    s_idx, e_idx = 0, len(arr) - 1
    idx = 0
    while s_idx <= e_idx:
        m_idx = (s_idx + e_idx) // 2
        if target <= int(arr[m_idx][1]):
            idx = m_idx
            e_idx = m_idx - 1
        else:
            s_idx = m_idx + 1
    return idx


def input():
    return sys.stdin.readline().strip()


M, N = map(int, input().split(" "))
ranks = [input().split(" ") for _ in range(M)]

for _ in range(N):
    power = int(input())
    print(ranks[bs(ranks, power)][0])
