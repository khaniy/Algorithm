def is_primary(n):
    for i in range(2,n):
        if(n%i == 0):
            return False
    return True

def solution(nums):
    n = len(nums)
    count = 0
    for i in range(n):
        for j in range(i+1, n):
            for k in range(j+1, n):
                sum = nums[i] + nums[j] + nums[k]
                if is_primary(sum):
                    count +=1
        

    return count