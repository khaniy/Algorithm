import sys
def input():
    return sys.stdin.readline().strip()
def cal(N):
    score = 0.
    if N[0] == 'A':
        score += 4
    elif N[0] == 'B':
        score += 3
    elif N[0] == 'C':
        score += 2
    elif N[0] == 'D':
        score += 1
    else:
        score += 0
    if len(N) ==2:
        if N[1] == '+':
            score += 0.3
        elif N[1] == '-':
            score -= 0.3
    return score

N = input()
print(cal(N))