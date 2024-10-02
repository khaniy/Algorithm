N = int(input())

five_kg = N // 5
while five_kg >= 0:
    rest = N - five_kg * 5
    if rest % 3 ==0:
        three_kg = rest // 3
        print(five_kg + three_kg)
        break
    five_kg -= 1
else:
    print(-1)