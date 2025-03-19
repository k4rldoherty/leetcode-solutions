def minOperations(nums):
    ws = 0
    we = ws+2
    num_operations = 0
    while we < len(nums):
        win = nums[ws:we+1]
        if nums[ws] == 0:
            nums[ws] = abs(nums[ws] - 1)
            nums[ws + 1] = abs(nums[ws + 1] - 1)
            nums[we] = abs(nums[we] - 1)
            num_operations += 1
            ws += 1
            we += 1

        if 0 in nums:
            return -1

        return num_operations

def main():
    t1 = [0,1,1,1,0,0]
    print(minOperations(t1))

main()
