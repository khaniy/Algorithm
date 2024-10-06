import re
import sys

def input():
    return sys.stdin.readline().strip()

matcher = re.compile(r'(100+1+|01)+')

T = int(input())
for _ in range(T):
    case = input()
    if matcher.fullmatch(case):
        print('YES')
    else:
        print('NO')