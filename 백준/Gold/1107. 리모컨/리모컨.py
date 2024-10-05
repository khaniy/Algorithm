def is_possible(channel, x_list):
    for ch in str(channel):
        if int(ch) in x_list:
            return False
    return True


def cal(N, x_list):
    min_cnt = abs(N - 100)
    for ch in range(1000000):
        if is_possible(ch, x_list):
            cnt = len(str(ch)) + abs(N - ch)
            min_cnt = min(min_cnt, cnt)
    return min_cnt


N = int(input())
M = int(input())
x_list = list(map(int, input().split(" "))) if M != 0 else []

print(cal(N, x_list))
