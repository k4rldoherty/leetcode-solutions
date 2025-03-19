def longestNiceSubarray(nums):
    if len(nums) == 1:
        return 1
    longest = 0
    for i in range(0, len(nums) - 1):
        if len(nums) - i < longest:
            break
        subarr = []
        subarr.append(nums[i])
        for j in range(i+1, len(nums)):
            bin_num = nums[j]
            valid = True
            for k in range(0, len(subarr)):
                if bin_num & subarr[k] != 0:
                    valid = False
            if valid:
                subarr.append(bin_num)
            else:
                break
            print(subarr)

        if longest < len(subarr):
            longest = len(subarr)

    return longest

def main():
    t1 = [1,3,8,48,10]
    print(longestNiceSubarray(t1))

main()
