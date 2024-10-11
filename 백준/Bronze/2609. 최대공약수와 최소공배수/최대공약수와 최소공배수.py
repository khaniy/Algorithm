import sys


def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


def input():
    return sys.stdin.readline().strip()


a, b = map(int, input().split(" "))
gcd_numb = gcd(a, b)
lcm_numb = a * b // gcd(a, b)

print(gcd_numb)
print(lcm_numb)
