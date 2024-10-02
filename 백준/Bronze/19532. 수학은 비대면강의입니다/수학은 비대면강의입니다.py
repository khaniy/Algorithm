import sys

a, b, c, d, e, f = map(int, sys.stdin.readline().split())

result_x = 0
result_y = 0

for x in range(-999, 999+1):
    for y in range(-999, 999+1):
        if (a * x + b * y == c and d * x + e * y == f):
            result_x = x
            result_y = y

print(result_x, result_y)
