import sys


def input():
    return sys.stdin.readline().strip()


while True:
    case = input()
    length = len(case)
    if case == "0":
        break
    check = False
    for i in range(length):
        if case[i] != case[length - 1 - i]:
            check = True
            break
    if check:
        print("no")
    else:
        print("yes")
