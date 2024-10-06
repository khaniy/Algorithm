T = int(input())
for _ in range(T):
    case = input().strip()
    score = 0
    prev = 0
    for c in case:
        if c == "O":
            prev += 1
            score += prev
        else:
            prev = 0
    print(score)

