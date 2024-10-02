import sys

N = int(input())
pattern = '666'
count = 0
i = 1
while True:
    if pattern in str(i):
        count += 1
    if count == N:
        break
    i += 1

print(i)
