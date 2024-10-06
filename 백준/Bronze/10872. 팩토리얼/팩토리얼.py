import sys
def input():
    return sys.stdin.readline().strip()

N= int(input())
fact = 1
for i in range(1, N+1):
    fact *= i
print(fact)




