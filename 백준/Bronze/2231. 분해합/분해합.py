import sys

input = sys.stdin.readline()
N = int(input)

smallest_constructor = 0

for M in range(1, N + 1):

    decomposition_sum = M + sum(map(int, str(M)))

    if decomposition_sum == N:
        smallest_constructor = M
        break

print(smallest_constructor)
