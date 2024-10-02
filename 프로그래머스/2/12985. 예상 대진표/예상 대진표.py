def solution(n,a,b):
    
    count = 0
    while True:
        count +=1
        a = a // 2 if a%2 == 0 else a//2+1
        b = b // 2 if b%2 == 0 else b//2+1
        if a == b or count >100:
            break
    return count