import sys

def input():
    return sys.stdin.readline().strip()


T = int(input())
for _ in range(T):
    func = input()
    n = int(input())
    input_str = input().strip("[").strip("]")

    numbs = list(map(int, input_str.split(","))) if input_str else []
    is_reversed = False
    is_error = False
    for f in func:
        if f == "R":
            is_reversed = not is_reversed
        elif f == "D":
            if numbs:
                if is_reversed:
                    numbs.pop(-1)
                else:
                    numbs.pop(0)
            else:
                is_error = True
                break
    if is_error:
        print("error")
    else:
        if is_reversed:
            numbs.reverse()
        print(f"[{','.join(map(str, numbs))}]")
