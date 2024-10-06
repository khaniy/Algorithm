N, M = map(int, input().split(" "))
p_list = []
p_dict = {}
for i in range(N):
    p = input()
    p_list.append(p)
    p_dict[p] = i + 1
for _ in range(M):
    x = input()
    if x.isdigit():
        print(p_list[int(x) - 1])
    else:
        print(p_dict[x])
