def isArraySpecial(nums, queries):
    if(len(nums) == 1):
        return [True] * len(queries)
    res = []
    for query in queries:
        falseAdded = False
        subarr = nums[query[0]:query[1]+1]
        print(subarr)
        for i in range(len(subarr) - 1):
            curr = subarr[i]
            next = subarr[i+1]
            if (isEven(curr) == isEven(next)):
                res.append(False)
                falseAdded = True
                break

        if not falseAdded:
            res.append(True)

    return res

def isEven(num):
    return num % 2 == 0

def main():
    n = [3,4,1,2,6]
    q = [[0,4]]
    print(isArraySpecial(n,q)) # [false]

    n1 = [4,3,1,6]
    q1 = [[0,2],[2,3]]
    print(isArraySpecial(n1,q1)) # [false, true]

    n2 = [3,7,8]
    q2 = [[0,2]]
    print(isArraySpecial(n2,q2)) # [false]

main()