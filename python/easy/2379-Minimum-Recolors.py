def minimum_recolors(blocks, k):
    win_start = 0
    win_end = win_start + k - 1
    min_recolors = k
    while win_end < len(blocks):
        count_w = 0
        for i in range(win_start, win_end+1):
            if blocks[i] == "W":
                count_w += 1

        if count_w == 0:
            return 0

        min_recolors = min(min_recolors, count_w)
        win_start += 1
        win_end += 1
    return min_recolors
        

def main():
    tests = [("WBBWWBBWBW", 7, 3), ("WBWBBBW", 2, 0), ("BWWWBB", 6, 3)]
    for i in range(0, len(tests)):
        print(f"Running Test {i + 1}")
        res = minimum_recolors(tests[i][0], tests[i][1])
        if res != tests[i][2]:
            print(f"Test failed.\nTest input: {tests[i][0]}, {tests[i][1]} \nExpected {tests[i][2]}, but got {res}")
            return
    print("All tests passed, congrats!")


if __name__ == "__main__":
    main()
